package com.demstudio.zzbzcglxt.service.consumable.impl;

import com.demstudio.zzbzcglxt.domain.Consumable;
import com.demstudio.zzbzcglxt.domain.ConsumableExample;
import com.demstudio.zzbzcglxt.repository.ConsumableMapper;
import com.demstudio.zzbzcglxt.service.consumable.ConsumableService;
import com.demstudio.zzbzcglxt.utils.PageUtils;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.demstudio.zzbzcglxt.vo.consumable.ConsumableVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class ConsumableServiceImpl implements ConsumableService {

    @Resource
    private ConsumableMapper consumableMapper;

    @Override
    public PageResult searchPage(PageRequest pageRequest, ConsumableExample example) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest, example));
    }

    @Override
    public boolean edit(Consumable consumable) {
        consumable.setConsumableId(DigestUtils.sha1Hex(UUID.randomUUID().toString()));
        consumable.setConsumableCount(0);
        return 1 == consumableMapper.insertSelective(consumable);
    }

    @Override
    public List<Consumable> list() {
        ConsumableExample example = new ConsumableExample();
        example.setOrderByClause("CONSUMABLE_NAME ASC");
        return consumableMapper.selectByExample(example);
    }

    @Override
    public boolean change(Consumable consumable) {
        return consumableMapper.addCount(consumable);
    }

    @Override
    public Consumable selectByPackageId(String consumableId) {
        ConsumableExample example = new ConsumableExample();
        example.createCriteria().andPackageIdEqualTo(consumableId);
        return consumableMapper.selectByExample(example).get(0);
    }

    private PageInfo<ConsumableVo> getPageInfo(PageRequest pageRequest, ConsumableExample example) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<ConsumableVo> consumable = consumableMapper.searchPage(example);
        return new PageInfo<ConsumableVo>(consumable);
    }
}
