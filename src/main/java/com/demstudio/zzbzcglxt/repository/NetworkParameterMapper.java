package com.demstudio.zzbzcglxt.repository;

import com.demstudio.zzbzcglxt.domain.NetworkParameter;
import com.demstudio.zzbzcglxt.domain.NetworkParameterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NetworkParameterMapper {
    long countByExample(NetworkParameterExample example);

    int deleteByExample(NetworkParameterExample example);

    int deleteByPrimaryKey(String networkParameterId);

    int insert(NetworkParameter record);

    int insertSelective(NetworkParameter record);

    List<NetworkParameter> selectByExample(NetworkParameterExample example);

    NetworkParameter selectByPrimaryKey(String networkParameterId);

    int updateByExampleSelective(@Param("record") NetworkParameter record, @Param("example") NetworkParameterExample example);

    int updateByExample(@Param("record") NetworkParameter record, @Param("example") NetworkParameterExample example);

    int updateByPrimaryKeySelective(NetworkParameter record);

    int updateByPrimaryKey(NetworkParameter record);
}