package com.demstudio.zzbzcglxt.service.equipment.impl;

import com.demstudio.zzbzcglxt.domain.RegistrationReason;
import com.demstudio.zzbzcglxt.domain.RegistrationReasonExample;
import com.demstudio.zzbzcglxt.domain.Secrecy;
import com.demstudio.zzbzcglxt.domain.SecrecyExample;
import com.demstudio.zzbzcglxt.repository.RegistrationReasonMapper;
import com.demstudio.zzbzcglxt.service.equipment.RegistrationReasonService;
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
public class RegistrationReasonServiceImpl implements RegistrationReasonService {

  @Resource
  private RegistrationReasonMapper registrationReasonMapper;

  @Override
  public PageResult searchPage(PageRequest pageRequest, RegistrationReasonExample example) {
    return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest, example));
  }

  @Override
  public boolean edit(RegistrationReason registrationReason) {
    if (registrationReason.getRegistrationReasonId() != null && !"".equals(registrationReason.getRegistrationReasonId())) {
      return 1 == registrationReasonMapper.updateByPrimaryKeySelective(registrationReason);
    } else {
      registrationReason.setRegistrationReasonId(DigestUtils.sha1Hex(UUID.randomUUID().toString()));
      return 1 == registrationReasonMapper.insertSelective(registrationReason);
    }
  }

  @Override
  public List<RegistrationReason> list() {
    RegistrationReasonExample example = new RegistrationReasonExample();
    example.setOrderByClause("REGISTRATION_REASON_NAME ASC");
    return registrationReasonMapper.selectByExample(example);
  }

  private PageInfo<RegistrationReason> getPageInfo(PageRequest pageRequest, RegistrationReasonExample example) {
    int pageNum = pageRequest.getPageNum();
    int pageSize = pageRequest.getPageSize();
    PageHelper.startPage(pageNum, pageSize);
    List<RegistrationReason> registrationReasons = registrationReasonMapper.searchPage(example);
    return new PageInfo<>(registrationReasons);
  }
}
