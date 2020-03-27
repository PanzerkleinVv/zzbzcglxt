package com.demstudio.zzbzcglxt.service.equipment.impl;

import com.demstudio.zzbzcglxt.domain.Secrecy;
import com.demstudio.zzbzcglxt.domain.SecrecyExample;
import com.demstudio.zzbzcglxt.repository.SecrecyMapper;
import com.demstudio.zzbzcglxt.service.equipment.SecrecyService;
import com.demstudio.zzbzcglxt.utils.PageUtils;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class SecrecyServiceImpl implements SecrecyService {

    @Resource
    private SecrecyMapper secrecyMapper;

    @Override
    public PageResult searchPage(PageRequest pageRequest, SecrecyExample example) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest, example));
    }

    @Override
    public Secrecy info(String secrecyId) {
        return secrecyMapper.selectByPrimaryKey(secrecyId);
    }

    @Override
    public boolean edit(Secrecy secrecy) {
        if (secrecy.getSecrecyId() != null && !"".equals(secrecy.getSecrecyId())) {
            return 1 == secrecyMapper.updateByPrimaryKeySelective(secrecy);
        } else {
            secrecy.setSecrecyId(DigestUtils.sha1Hex(UUID.randomUUID().toString()));
            return 1 == secrecyMapper.insertSelective(secrecy);
        }
    }

    @Override
    public List<Secrecy> list() {
        SecrecyExample example = new SecrecyExample();
        example.setOrderByClause("SECRECY_NAME ASC");
        return secrecyMapper.selectByExample(example);
    }

    private PageInfo<Secrecy> getPageInfo(PageRequest pageRequest, SecrecyExample example) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<Secrecy> secrecyList = secrecyMapper.searchPage(example);
        return new PageInfo<>(secrecyList);
    }
}
