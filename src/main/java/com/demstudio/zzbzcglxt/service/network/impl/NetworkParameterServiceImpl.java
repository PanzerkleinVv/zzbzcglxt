package com.demstudio.zzbzcglxt.service.network.impl;

import com.demstudio.zzbzcglxt.domain.NetworkParameter;
import com.demstudio.zzbzcglxt.domain.NetworkParameterExample;
import com.demstudio.zzbzcglxt.repository.NetworkParameterMapper;
import com.demstudio.zzbzcglxt.service.network.NetworkParameterService;
import com.demstudio.zzbzcglxt.utils.PageUtils;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.demstudio.zzbzcglxt.vo.layUI.LayUIPageRequest;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class NetworkParameterServiceImpl implements NetworkParameterService {

    @Resource
    private NetworkParameterMapper networkParameterMapper;

    @Override
    public PageResult search(LayUIPageRequest pageRequest, NetworkParameterExample example) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest, example));
    }

    @Override
    public boolean edit(NetworkParameter networkParameter) {
        if (networkParameter.getNetworkParameterId() != null && !"".equals(networkParameter.getNetworkParameterId())) {
            return 1 == networkParameterMapper.updateByPrimaryKeySelective(networkParameter);
        } else {
            networkParameter.setNetworkParameterId(DigestUtils.sha1Hex(UUID.randomUUID().toString()));
            return 1 == networkParameterMapper.insertSelective(networkParameter);
        }
    }

    @Override
    public List<NetworkParameter> list(NetworkParameterExample example) {
        return networkParameterMapper.selectByExample(example);
    }

    private PageInfo<NetworkParameter> getPageInfo(LayUIPageRequest pageRequest, NetworkParameterExample example) {
        int pageNum = pageRequest.getPage();
        int pageSize = pageRequest.getLimit();
        PageHelper.startPage(pageNum, pageSize);
        List<NetworkParameter> networkParameters = networkParameterMapper.selectByExample(example);
        return new PageInfo<>(networkParameters);
    }
}
