package com.demstudio.zzbzcglxt.service.consumable.impl;

import com.demstudio.zzbzcglxt.domain.Ledger;
import com.demstudio.zzbzcglxt.domain.LedgerExample;
import com.demstudio.zzbzcglxt.repository.LedgerMapper;
import com.demstudio.zzbzcglxt.service.consumable.LedgerService;
import com.demstudio.zzbzcglxt.utils.PageUtils;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.demstudio.zzbzcglxt.vo.consumable.LedgerVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class LedgerServiceImpl implements LedgerService {

    @Resource
    private LedgerMapper ledgerMapper;

    @Override
    public PageResult searchPage(PageRequest pageRequest, LedgerExample example) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest, example));
    }

    @Override
    public boolean edit(Ledger ledger) {
        ledger.setLedgerId(DigestUtils.sha1Hex(UUID.randomUUID().toString()));
        return 1 == ledgerMapper.insertSelective(ledger);
    }

    private PageInfo<LedgerVo> getPageInfo(PageRequest pageRequest, LedgerExample example) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<LedgerVo> ledger = ledgerMapper.searchPage(example);
        return new PageInfo<>(ledger);
    }
}
