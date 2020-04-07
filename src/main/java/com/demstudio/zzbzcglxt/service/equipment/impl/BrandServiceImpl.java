package com.demstudio.zzbzcglxt.service.equipment.impl;

import com.demstudio.zzbzcglxt.domain.Brand;
import com.demstudio.zzbzcglxt.domain.BrandExample;
import com.demstudio.zzbzcglxt.repository.BrandMapper;
import com.demstudio.zzbzcglxt.service.equipment.BrandService;
import com.demstudio.zzbzcglxt.utils.PageUtils;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.demstudio.zzbzcglxt.vo.equipment.BrandVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class BrandServiceImpl implements BrandService {

  @Resource
  private BrandMapper brandMapper;

  @Override
  public PageResult searchPage(PageRequest pageRequest, BrandExample example) {
    return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest, example));
  }

  @Override
  public boolean edit(Brand brand) {
    if (brand.getBrandId() != null && !"".equals(brand.getBrandId())) {
      return 1 == brandMapper.updateByPrimaryKeySelective(brand);
    } else {
      brand.setBrandId(DigestUtils.sha1Hex(UUID.randomUUID().toString()));
      return 1 == brandMapper.insertSelective(brand);
    }
  }

  @Override
  public Brand info(String brandId) {
    return brandMapper.selectByPrimaryKey(brandId);
  }

  private PageInfo<BrandVo> getPageInfo(PageRequest pageRequest, BrandExample example) {
    int pageNum = pageRequest.getPageNum();
    int pageSize = pageRequest.getPageSize();
    PageHelper.startPage(pageNum, pageSize);
    List<BrandVo> brands = brandMapper.searchPage(example);
    return new PageInfo<>(brands);
  }
}
