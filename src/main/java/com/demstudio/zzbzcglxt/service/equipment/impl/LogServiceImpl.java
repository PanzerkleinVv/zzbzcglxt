package com.demstudio.zzbzcglxt.service.equipment.impl;

import com.demstudio.zzbzcglxt.domain.Log;
import com.demstudio.zzbzcglxt.domain.LogExample;
import com.demstudio.zzbzcglxt.repository.LogMapper;
import com.demstudio.zzbzcglxt.service.equipment.LogService;
import com.demstudio.zzbzcglxt.vo.equipment.LogVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LogServiceImpl implements LogService {

    @Resource
    private LogMapper logMapper;


    @Override
    public void deleteByLogEquipment(String logEquipment) {
        LogExample example = new LogExample();
        example.createCriteria().andLogEquipmentEqualTo(logEquipment);
        logMapper.deleteByExample(example);
    }

    @Override
    public boolean addLog(Log log) {
        return 1 == logMapper.insertSelective(log);
    }

    @Override
    public List<LogVo> list(String logEquipment) {
        LogExample example = new LogExample();
        example.createCriteria().andLogEquipmentEqualTo(logEquipment);
        example.setOrderByClause("LOG_OPERATION_DATE DESC, LOG_TIME DESC");
        return logMapper.list(example);
    }
}
