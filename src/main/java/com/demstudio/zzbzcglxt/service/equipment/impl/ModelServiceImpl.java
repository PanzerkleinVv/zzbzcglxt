package com.demstudio.zzbzcglxt.service.equipment.impl;

import com.demstudio.zzbzcglxt.domain.Model;
import com.demstudio.zzbzcglxt.domain.ModelExample;
import com.demstudio.zzbzcglxt.repository.ModelMapper;
import com.demstudio.zzbzcglxt.service.equipment.ModelService;
import com.demstudio.zzbzcglxt.utils.PageUtils;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.demstudio.zzbzcglxt.vo.equipment.ModelVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class ModelServiceImpl implements ModelService {

  @Resource
  private ModelMapper modelMapper;

  @Override
  public PageResult searchPage(PageRequest pageRequest, ModelExample example) {
    return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest, example));
  }

  @Override
  public boolean edit(Model model) {
    if (model.getModelId() != null && !"".equals(model.getModelId())) {
      return 1 == modelMapper.updateByPrimaryKeySelective(model);
    } else {
      model.setModelId(DigestUtils.sha1Hex(UUID.randomUUID().toString()));
      return 1 == modelMapper.insertSelective(model);
    }
  }

  private PageInfo<ModelVo> getPageInfo(PageRequest pageRequest, ModelExample example) {
    int pageNum = pageRequest.getPageNum();
    int pageSize = pageRequest.getPageSize();
    PageHelper.startPage(pageNum, pageSize);
    List<ModelVo> models = modelMapper.searchPage(example);
    return new PageInfo<>(models);
  }
}
