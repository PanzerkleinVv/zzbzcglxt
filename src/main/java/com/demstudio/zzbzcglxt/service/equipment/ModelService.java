package com.demstudio.zzbzcglxt.service.equipment;

import com.demstudio.zzbzcglxt.domain.Model;
import com.demstudio.zzbzcglxt.domain.ModelExample;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;

public interface ModelService {

  PageResult searchPage(PageRequest pageRequest, ModelExample example);

  boolean edit(Model model);

  Model info(String modelId);
}
