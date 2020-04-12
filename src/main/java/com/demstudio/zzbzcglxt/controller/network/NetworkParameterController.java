package com.demstudio.zzbzcglxt.controller.network;

import com.demstudio.zzbzcglxt.domain.NetworkParameter;
import com.demstudio.zzbzcglxt.service.network.NetworkParameterService;
import com.demstudio.zzbzcglxt.vo.Message;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.demstudio.zzbzcglxt.vo.layUI.LayUI;
import com.demstudio.zzbzcglxt.vo.layUI.LayUIPageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/network/networkParameter")
public class NetworkParameterController {

  @Resource
  private NetworkParameterService networkParameterService;

  @GetMapping("/search")
  public PageResult search(PageRequest pageRequest, NetworkParameter networkParameter) {
    return networkParameterService.search(pageRequest, networkParameter.toExample());
  }

  @GetMapping("/info")
  public NetworkParameter info(String networkParameterId) {
    return networkParameterService.info(networkParameterId);
  }

  @PostMapping("/edit")
  public Message edit(NetworkParameter networkParameter) {
    if (networkParameterService.edit(networkParameter)) {
      return new Message(true, "保存成功");
    } else {
      return new Message(false, "保存失败");
    }
  }

  @GetMapping("/list")
  public List<NetworkParameter> list(NetworkParameter networkParameter) {
    return networkParameterService.list(networkParameter.toExample());
  }
}
