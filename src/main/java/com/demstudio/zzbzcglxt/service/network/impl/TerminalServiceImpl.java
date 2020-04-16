package com.demstudio.zzbzcglxt.service.network.impl;

import com.demstudio.zzbzcglxt.domain.Terminal;
import com.demstudio.zzbzcglxt.domain.TerminalExample;
import com.demstudio.zzbzcglxt.repository.TerminalMapper;
import com.demstudio.zzbzcglxt.service.network.TerminalService;
import com.demstudio.zzbzcglxt.vo.network.TerminalVo;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.net.InetAddress;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

@Service
public class TerminalServiceImpl implements TerminalService {

  @Resource
  private TerminalMapper terminalMapper;

  @Override
  public List<Terminal> search(TerminalExample example) {
    return terminalMapper.selectByExample(example);
  }

  @Override
  public List<TerminalVo> searchVo(TerminalExample example) {
    return terminalMapper.selectVoByExample(example);
  }

  @Override
  public boolean edit(Terminal terminal) {
    if (terminal.getTerminalId() != null && !"".equals(terminal.getTerminalId())) {
      return 1 == terminalMapper.updateByPrimaryKeySelective(terminal);
    } else {
      terminal.setTerminalId(DigestUtils.sha1Hex(UUID.randomUUID().toString()));
      return 1 == terminalMapper.insertSelective(terminal);
    }
  }

  @Override
  public boolean checkIp(Terminal terminal) {
    TerminalExample example = new TerminalExample();
    example.createCriteria().andIp0EqualTo(terminal.getIp0()).andIp1EqualTo(terminal.getIp1()).andIp2EqualTo(terminal.getIp2()).andIp3EqualTo(terminal.getIp3()).andTerminalIdNotEqualTo(terminal.getTerminalId());
    return terminalMapper.countByExample(example) == 0;
  }

  @Override
  public boolean delete(String terminalId) {
    return terminalMapper.deleteByPrimaryKey(terminalId) > 0;
  }

  @Override
  @Async("asyncServiceExecutor")
  public void ping(String terminalIp, Map<String, Boolean> status, CountDownLatch countDownLatch) throws Exception {
    try {
      status.put(terminalIp, ping(terminalIp));
    } catch (Exception e) {
      e.printStackTrace();
      throw new Exception("ping失败-" + terminalIp);
    } finally {
      countDownLatch.countDown();
    }
  }

  @Override
  @Async("asyncServiceExecutor")
  public void scan(String terminalIp, Set<String> pingableIps, CountDownLatch countDownLatch) throws Exception {
    try {
      if (ping(terminalIp)) {
        pingableIps.add(terminalIp);
      }
    } catch (Exception e) {
      e.printStackTrace();
      throw new Exception("ping失败-" + terminalIp);
    } finally {
      countDownLatch.countDown();
    }
  }

  @Override
  public Terminal info(String terminalId) {
    return terminalMapper.selectByPrimaryKey(terminalId);
  }

  @Override
  public boolean ping(String ip) {
    try {
      if (ip != null) {
        InetAddress addr = InetAddress.getByName(ip);
        return addr.isReachable(500);
      } else {
        return false;
      }
    } catch (IOException e) {
      e.printStackTrace();
      return false;
    }
  }
}
