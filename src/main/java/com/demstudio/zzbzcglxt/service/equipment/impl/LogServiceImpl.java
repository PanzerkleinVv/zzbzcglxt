package com.demstudio.zzbzcglxt.service.equipment.impl;

import com.demstudio.zzbzcglxt.domain.Log;
import com.demstudio.zzbzcglxt.domain.LogExample;
import com.demstudio.zzbzcglxt.repository.LogMapper;
import com.demstudio.zzbzcglxt.service.equipment.LogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
}
