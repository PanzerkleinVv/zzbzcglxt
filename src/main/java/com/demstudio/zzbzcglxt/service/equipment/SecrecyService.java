package com.demstudio.zzbzcglxt.service.equipment;

import com.demstudio.zzbzcglxt.domain.Secrecy;
import com.demstudio.zzbzcglxt.domain.SecrecyExample;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;

import java.util.List;

public interface SecrecyService {

    PageResult searchPage(PageRequest pageRequest, SecrecyExample example);

    Secrecy info(String secrecyId);

    boolean edit(Secrecy secrecy);

    List<Secrecy> list();
}
