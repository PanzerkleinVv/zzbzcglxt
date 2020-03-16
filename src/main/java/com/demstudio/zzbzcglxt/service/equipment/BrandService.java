package com.demstudio.zzbzcglxt.service.equipment;

import com.demstudio.zzbzcglxt.domain.Brand;
import com.demstudio.zzbzcglxt.domain.BrandExample;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;

import java.util.List;

public interface BrandService {

    PageResult searchPage(PageRequest pageRequest, BrandExample example);

    Brand info(String brandId);

    boolean edit(Brand brand);

    List<Brand> list(String brandType);
}
