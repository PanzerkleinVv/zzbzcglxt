package com.demstudio.zzbzcglxt.controller.equipment;

import com.demstudio.zzbzcglxt.domain.RegistrationReason;
import com.demstudio.zzbzcglxt.domain.RegistrationReasonExample;
import com.demstudio.zzbzcglxt.service.equipment.RegistrationReasonService;
import com.demstudio.zzbzcglxt.vo.Message;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/equipment/registrationReason")
public class RegistrationReasonController {

  @Resource
  private RegistrationReasonService registrationReasonService;

  @GetMapping("/search")
  public PageResult search(PageRequest pageRequest, @RequestParam(required = false) String registrationReasonName) {
    RegistrationReasonExample example = new RegistrationReasonExample();
    if (registrationReasonName != null && !"".equals(registrationReasonName)) {
      example.createCriteria().andRegistrationReasonNameLike("%" + registrationReasonName + "%");
    }
    example.setOrderByClause("REGISTRATION_REASON_NAME ASC");
    return registrationReasonService.searchPage(pageRequest, example);
  }

  @PostMapping("/edit")
  public Message edit(RegistrationReason registrationReason) {
    if (registrationReasonService.edit(registrationReason)) {
      return new Message(true, "保存成功");
    } else {
      return new Message(false, "保存失败");
    }
  }

  @GetMapping("/list")
  public List<RegistrationReason> list() {
    return registrationReasonService.list();
  }
}
