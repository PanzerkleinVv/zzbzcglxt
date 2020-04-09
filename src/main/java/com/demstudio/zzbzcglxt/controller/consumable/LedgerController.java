package com.demstudio.zzbzcglxt.controller.consumable;

import com.demstudio.zzbzcglxt.biz.ConsumableBiz;
import com.demstudio.zzbzcglxt.domain.Ledger;
import com.demstudio.zzbzcglxt.domain.LedgerExample;
import com.demstudio.zzbzcglxt.domain.User;
import com.demstudio.zzbzcglxt.vo.Message;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.Instant;
import java.util.Date;

@RestController
@RequestMapping("/consumable/ledger")
public class LedgerController {

  @Resource
  private ConsumableBiz consumableBiz;

  @GetMapping("/search")
  public PageResult search(PageRequest pageRequest, String ledgerConsumable) {
    LedgerExample example = new LedgerExample();
    if (ledgerConsumable != null && !"".equals(ledgerConsumable)) {
      example.createCriteria().andLedgerConsumableEqualTo(ledgerConsumable);
    }
    example.setOrderByClause("LEDGER_TIME DESC, CONSUMABLE_NAME ASC");
    return consumableBiz.ledgerPage(pageRequest, example);
  }

  @PostMapping("/edit")
  public Message edit(Ledger ledger, @RequestParam(required = false) Integer subCount) {
    final User me = (User) SecurityUtils.getSubject().getPrincipal();
    ledger.setLedgerUser(me.getUserId());
    ledger.setLedgerTime(Date.from(Instant.now()));
    if (consumableBiz.newLedger(ledger, subCount)) {
      return new Message(true, "保存成功");
    } else {
      return new Message(false, "保存失败");
    }
  }

}
