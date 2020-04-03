package com.demstudio.zzbzcglxt.controller.network;

import com.demstudio.zzbzcglxt.domain.NetworkParameter;
import com.demstudio.zzbzcglxt.service.network.NetworkParameterService;
import com.demstudio.zzbzcglxt.vo.Message;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.demstudio.zzbzcglxt.vo.layUI.LayUI;
import com.demstudio.zzbzcglxt.vo.layUI.LayUIPageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/network/networkParameter")
public class NetworkParameterController {

    @Resource
    private NetworkParameterService networkParameterService;

    @GetMapping("/index")
    public String index() {
        return "network/networkParameter";
    }

    @GetMapping("/search")
    @ResponseBody
    public LayUI<List<NetworkParameter>> search(LayUIPageRequest pageRequest, NetworkParameter networkParameter) {
        PageResult result = networkParameterService.search(pageRequest, networkParameter.toExample());
        LayUI<List<NetworkParameter>> layUI = new LayUI<>();
        layUI.setCode(0);
        layUI.setCount(result.getTotalPages());
        layUI.setMsg("");
        layUI.setData((List<NetworkParameter>) result.getContent());
        return layUI;
    }

    @PostMapping("/edit")
    @ResponseBody
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
