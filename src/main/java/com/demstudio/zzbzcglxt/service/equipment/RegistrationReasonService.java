package com.demstudio.zzbzcglxt.service.equipment;

import com.demstudio.zzbzcglxt.domain.RegistrationReason;
import com.demstudio.zzbzcglxt.domain.RegistrationReasonExample;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;

import java.util.List;

public interface RegistrationReasonService {

  PageResult searchPage(PageRequest pageRequest, RegistrationReasonExample example);

  boolean edit(RegistrationReason registrationReason);

  List<RegistrationReason> list();
}
