package com.demstudio.zzbzcglxt.controller.network;

import com.demstudio.zzbzcglxt.biz.AsyncTerminalBiz;
import com.demstudio.zzbzcglxt.domain.Terminal;
import com.demstudio.zzbzcglxt.domain.TerminalExample;
import com.demstudio.zzbzcglxt.service.network.TerminalService;
import com.demstudio.zzbzcglxt.vo.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/network/terminal")
public class TerminalController {

  @Resource
  private TerminalService terminalService;

  @Resource
  private AsyncTerminalBiz asyncTerminalBiz;

  @GetMapping("/search")
  public List<Terminal> search(String ip, String terminalType) {
    return terminalService.search(Terminal.toExample(ip, terminalType));
  }

  @PostMapping("/status")
  public Map<String, Boolean> status(List<String> terminalIps) {
    return asyncTerminalBiz.ping(terminalIps);
  }

  @GetMapping("/scan")
  public List<String> scan(String segment) {
    return new ArrayList<>(asyncTerminalBiz.scan(segment));
  }

  @PostMapping("/edit")
  public Message edit(Terminal terminal) {
    if (terminalService.edit(terminal)) {
      return new Message(true, "保存成功");
    } else {
      return new Message(false, "保存失败");
    }
  }

  @GetMapping("/checkIp")
  public Boolean checkIp(Terminal terminal) {
    return terminalService.checkIp(terminal);
  }

  @GetMapping("/delete")
  public Message delete(String terminalId) {
    if (terminalService.delete(terminalId)) {
      return new Message(true, "删除成功");
    } else {
      return new Message(false, "删除失败");
    }
  }

  @GetMapping("/switchList")
  public List<Terminal> switchList(String switchTypeId, String terminalId) {
    TerminalExample example = new TerminalExample();
    example.createCriteria().andTerminalTypeEqualTo(switchTypeId).andTerminalIdNotEqualTo(terminalId);
    example.setOrderByClause("terminal_name asc");
    return terminalService.search(example);
  }
}
