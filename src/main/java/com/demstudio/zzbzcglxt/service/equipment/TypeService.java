package com.demstudio.zzbzcglxt.service.equipment;

import com.demstudio.zzbzcglxt.domain.Type;
import com.demstudio.zzbzcglxt.domain.TypeExample;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;

import java.util.List;

public interface TypeService {

    PageResult searchPage(PageRequest pageRequest, TypeExample example);

    Type info(String typeId);

    boolean edit(Type type);

    List<Type> list();

}
