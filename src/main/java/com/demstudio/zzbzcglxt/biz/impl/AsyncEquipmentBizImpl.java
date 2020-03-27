package com.demstudio.zzbzcglxt.biz.impl;

import com.demstudio.zzbzcglxt.biz.AsyncEquipmentBiz;
import com.demstudio.zzbzcglxt.biz.EquipmentBiz;
import com.demstudio.zzbzcglxt.domain.Log;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.concurrent.CountDownLatch;

@Service
public class AsyncEquipmentBizImpl implements AsyncEquipmentBiz {

    @Resource
    private EquipmentBiz equipmentBiz;

    @Override
    @Transactional
    public boolean multipleSave(Log log, String[] logEquipments) {
        try {
            CountDownLatch countDownLatch = new CountDownLatch(logEquipments.length);
            for (String logEquipment : logEquipments) {
                Log log0 = new Log(log);
                log0.setLogEquipment(logEquipment);
                equipmentBiz.saveAsync(log0, countDownLatch);
            }
            countDownLatch.await();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
