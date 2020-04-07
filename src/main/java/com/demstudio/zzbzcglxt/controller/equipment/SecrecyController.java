package com.demstudio.zzbzcglxt.controller.equipment;

import com.demstudio.zzbzcglxt.domain.Secrecy;
import com.demstudio.zzbzcglxt.domain.SecrecyExample;
import com.demstudio.zzbzcglxt.service.equipment.SecrecyService;
import com.demstudio.zzbzcglxt.vo.Message;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/equipment/secrecy")
public class SecrecyController {

  @Resource
  private SecrecyService secrecyService;

  @GetMapping("/index")
  public String index() {
    return "equipment/secrecy";
  }

  @GetMapping("/search")
  public PageResult search(PageRequest pageRequest, @RequestParam(required = false) String secrecyName) {
    SecrecyExample example = new SecrecyExample();
    if (secrecyName != null && !"".equals(secrecyName)) {
      example.createCriteria().andSecrecyNameLike("%" + secrecyName + "%");
    }
    example.setOrderByClause("SECRECY_NAME ASC");
    return secrecyService.searchPage(pageRequest, example);
  }

  @GetMapping("/info")
  public Secrecy info(String secrecyId) {
    return secrecyService.info(secrecyId);
  }

  @PostMapping("/edit")
  public Message edit(Secrecy secrecy) {
    if (secrecyService.edit(secrecy)) {
      return new Message(true, "保存成功");
    } else {
      return new Message(false, "保存失败");
    }
  }

  @GetMapping("/list")
  public List<Secrecy> list() {
    return secrecyService.list();
  }
}
