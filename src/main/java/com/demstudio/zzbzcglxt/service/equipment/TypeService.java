package com.demstudio.zzbzcglxt.service.equipment;

import com.demstudio.zzbzcglxt.domain.Type;
import com.demstudio.zzbzcglxt.domain.TypeExample;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.demstudio.zzbzcglxt.vo.equipment.TypeExtend;

import java.util.List;

public interface TypeService {

  PageResult searchPage(PageRequest pageRequest, TypeExample example);

  boolean edit(Type type);

  List<TypeExtend> list();

}
