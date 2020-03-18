package com.demstudio.zzbzcglxt.repository;

import com.demstudio.zzbzcglxt.domain.Log;
import com.demstudio.zzbzcglxt.domain.LogExample;
import com.demstudio.zzbzcglxt.vo.equipment.LogVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogMapper {
    long countByExample(LogExample example);

    int deleteByExample(LogExample example);

    int deleteByPrimaryKey(String logId);

    int insert(Log record);

    int insertSelective(Log record);

    List<Log> selectByExample(LogExample example);

    Log selectByPrimaryKey(String logId);

    int updateByExampleSelective(@Param("record") Log record, @Param("example") LogExample example);

    int updateByExample(@Param("record") Log record, @Param("example") LogExample example);

    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKey(Log record);

    List<LogVo> list(String logEquipment);
}