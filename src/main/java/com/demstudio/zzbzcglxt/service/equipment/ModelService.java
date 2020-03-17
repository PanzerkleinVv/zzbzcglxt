package com.demstudio.zzbzcglxt.service.equipment;

import com.demstudio.zzbzcglxt.domain.Model;
import com.demstudio.zzbzcglxt.domain.ModelExample;
import com.demstudio.zzbzcglxt.vo.equipment.ModelVo;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;

import java.util.List;

public interface ModelService {

    PageResult searchPage(PageRequest pageRequest, ModelExample example);

    ModelVo info(String modelId);

    boolean edit(Model model);

    List<Model> list(String modelBrand);
}
