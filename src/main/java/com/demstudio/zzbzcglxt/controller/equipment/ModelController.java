package com.demstudio.zzbzcglxt.controller.equipment;

import com.demstudio.zzbzcglxt.domain.Model;
import com.demstudio.zzbzcglxt.domain.ModelExample;
import com.demstudio.zzbzcglxt.service.equipment.ModelService;
import com.demstudio.zzbzcglxt.vo.Message;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/equipment/model")
public class ModelController {

  @Resource
  private ModelService modelService;

  @GetMapping("/search")
  public PageResult search(PageRequest pageRequest, @RequestParam(required = false) String modelName, @RequestParam(required = false) String modelBrand) {
    ModelExample example = new ModelExample();
    if (modelName != null && !"".equals(modelName)) {
      if (modelBrand == null || "".equals(modelBrand)) {
        example.createCriteria().andModelNameLike("%" + modelName + "%");
      } else {
        example.createCriteria().andModelNameLike("%" + modelName + "%").andModelBrandEqualTo(modelBrand);
      }
    } else if (modelBrand != null && !"".equals(modelBrand)) {
      example.createCriteria().andModelBrandEqualTo(modelBrand);
    }
    example.setOrderByClause("TYPE_NAME ASC, BRAND_NAME ASC, MODEL_NAME ASC");
    return modelService.searchPage(pageRequest, example);
  }

  @GetMapping("/info")
  public Model info(String modelId) {
    return modelService.info(modelId);
  }

  @PostMapping("/edit")
  public Message edit(Model model) {
    if (modelService.edit(model)) {
      return new Message(true, "保存成功");
    } else {
      return new Message(false, "保存失败");
    }
  }
}
