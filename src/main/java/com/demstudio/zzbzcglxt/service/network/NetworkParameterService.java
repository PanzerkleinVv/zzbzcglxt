package com.demstudio.zzbzcglxt.service.network;

import com.demstudio.zzbzcglxt.domain.NetworkParameter;
import com.demstudio.zzbzcglxt.domain.NetworkParameterExample;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.demstudio.zzbzcglxt.vo.layUI.LayUIPageRequest;

import java.util.List;

public interface NetworkParameterService {
  PageResult search(PageRequest pageRequest, NetworkParameterExample example);

  NetworkParameter info(String networkParameterId);

  boolean edit(NetworkParameter networkParameter);

  List<NetworkParameter> list(NetworkParameterExample example);
}
