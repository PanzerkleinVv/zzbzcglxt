package com.demstudio.zzbzcglxt.service.consumable.impl;

import com.demstudio.zzbzcglxt.domain.Consumable;
import com.demstudio.zzbzcglxt.domain.ConsumableExample;
import com.demstudio.zzbzcglxt.repository.ConsumableMapper;
import com.demstudio.zzbzcglxt.service.consumable.ConsumableService;
import com.demstudio.zzbzcglxt.utils.PageUtils;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.codec.digest.DigestUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

public class ConsumableServiceImpl implements ConsumableService {

    @Resource
    private ConsumableMapper consumableMapper;

    @Override
    public PageResult searchPage(PageRequest pageRequest, ConsumableExample example) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest, example));
    }

    @Override
    public Consumable info(String consumableId) {
        return consumableMapper.selectByPrimaryKey(consumableId);
    }

    @Override
    public boolean edit(Consumable consumable) {
        consumable.setConsumableId(DigestUtils.sha1Hex(UUID.randomUUID().toString()));
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

    private PageInfo<Consumable> getPageInfo(PageRequest pageRequest, ConsumableExample example) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<Consumable> consumable = consumableMapper.searchPage(example);
        return new PageInfo<Consumable>(consumable);
    }
}
