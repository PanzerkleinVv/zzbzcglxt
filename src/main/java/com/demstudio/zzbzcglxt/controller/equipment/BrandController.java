package com.demstudio.zzbzcglxt.controller.equipment;

import com.demstudio.zzbzcglxt.domain.Brand;
import com.demstudio.zzbzcglxt.domain.BrandExample;
import com.demstudio.zzbzcglxt.service.equipment.BrandService;
import com.demstudio.zzbzcglxt.vo.Message;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/equipment/brand")
public class BrandController {

  @Resource
  private BrandService brandService;

  @GetMapping("/search")
  public PageResult search(PageRequest pageRequest, @RequestParam(required = false) String brandName, @RequestParam(required = false) String brandType) {
    BrandExample example = new BrandExample();
    if (brandName != null && !"".equals(brandName)) {
      if (brandType == null || "".equals(brandType)) {
        example.createCriteria().andBrandNameLike("%" + brandName + "%");
      } else {
        example.createCriteria().andBrandNameLike("%" + brandName + "%").andBrandTypeEqualTo(brandType);
      }
    } else if (brandType != null && !"".equals(brandType)) {
      example.createCriteria().andBrandTypeEqualTo(brandType);
    }
    example.setOrderByClause("TYPE_NAME ASC, BRAND_NAME ASC");
    return brandService.searchPage(pageRequest, example);
  }

  @GetMapping("/info")
  public Brand info(String brandId) {
    return brandService.info(brandId);
  }

  @PostMapping("/edit")
  public Message edit(Brand brand) {
    if (brandService.edit(brand)) {
      return new Message(true, "保存成功");
    } else {
      return new Message(false, "保存失败");
    }
  }

}
