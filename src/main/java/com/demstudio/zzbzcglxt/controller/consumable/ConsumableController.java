package com.demstudio.zzbzcglxt.controller.consumable;

import com.demstudio.zzbzcglxt.biz.ConsumableBiz;
import com.demstudio.zzbzcglxt.domain.Consumable;
import com.demstudio.zzbzcglxt.domain.ConsumableExample;
import com.demstudio.zzbzcglxt.vo.Message;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/consumable")
public class ConsumableController {

  @Resource
  private ConsumableBiz consumableBiz;

  @GetMapping("/search")
  public PageResult search(PageRequest pageRequest, @RequestParam(required = false) String consumableName) {
    ConsumableExample example = new ConsumableExample();
    if (consumableName != null && !"".equals(consumableName)) {
      example.createCriteria().andConsumableNameLike("%" + consumableName + "%");
    }
    example.setOrderByClause("CONSUMABLE_NAME ASC");
    return consumableBiz.consumablePage(pageRequest, example);
  }

  @PostMapping("/edit")
  public Message edit(Consumable consumable) {
    if (consumableBiz.setConsumable(consumable)) {
      return new Message(true, "保存成功");
    } else {
      return new Message(false, "保存失败");
    }
  }

  @GetMapping("/list")
  public List<Consumable> list() {
    return consumableBiz.list();
  }

}
