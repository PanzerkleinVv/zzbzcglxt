package com.demstudio.zzbzcglxt.service.equipment;

import com.demstudio.zzbzcglxt.domain.Brand;
import com.demstudio.zzbzcglxt.domain.BrandExample;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;

public interface BrandService {

  PageResult searchPage(PageRequest pageRequest, BrandExample example);

  boolean edit(Brand brand);

  Brand info(String brandId);
}
