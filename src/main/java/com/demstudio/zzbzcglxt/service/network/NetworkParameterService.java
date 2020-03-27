package com.demstudio.zzbzcglxt.service.network;

import com.demstudio.zzbzcglxt.domain.NetworkParameter;
import com.demstudio.zzbzcglxt.domain.NetworkParameterExample;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.demstudio.zzbzcglxt.vo.layUI.LayUIPageRequest;

import java.util.List;

public interface NetworkParameterService {
    PageResult search(LayUIPageRequest pageRequest, NetworkParameterExample example);

    boolean edit(NetworkParameter networkParameter);

    List<NetworkParameter> list(NetworkParameterExample example);
}
