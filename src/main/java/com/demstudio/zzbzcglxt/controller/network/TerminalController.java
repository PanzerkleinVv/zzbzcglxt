package com.demstudio.zzbzcglxt.controller.network;

import com.demstudio.zzbzcglxt.biz.AsyncTerminalBiz;
import com.demstudio.zzbzcglxt.domain.Terminal;
import com.demstudio.zzbzcglxt.service.network.TerminalService;
import com.demstudio.zzbzcglxt.vo.Message;
import com.demstudio.zzbzcglxt.vo.network.TerminalVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
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
  public List<TerminalVo> search(String ip, String terminalSegment) {
    return terminalService.searchVo(Terminal.toExample(ip, terminalSegment));
  }

  @GetMapping("/info")
  public Terminal info(String terminalId) {
    return terminalService.info(terminalId);
  }

  @PostMapping("/status")
  public Map<String, Boolean> status(String[] terminalIps) {
    return asyncTerminalBiz.ping(Arrays.asList(terminalIps));
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

  @GetMapping("/ping")
  public Boolean ping(String terminalIp) {
    return terminalService.ping(terminalIp);
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
  public List<Terminal> switchList() {
    return terminalService.search(Terminal.switchExample());
  }
}
