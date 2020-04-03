package com.demstudio.zzbzcglxt.biz.impl;

import com.demstudio.zzbzcglxt.biz.AsyncTerminalBiz;
import com.demstudio.zzbzcglxt.service.network.TerminalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CountDownLatch;

@Service
public class AsyncTerminalBizImpl implements AsyncTerminalBiz {

    @Resource
    private TerminalService terminalService;

    @Override
    public Map<String, Boolean> ping(List<String> terminalIps) {
        try {
            CountDownLatch countDownLatch = new CountDownLatch(terminalIps.size());
            Map<String, Boolean> status = new ConcurrentHashMap<>();
            for (String terminalIp : terminalIps) {
                terminalService.ping(terminalIp, status, countDownLatch);
            }
            countDownLatch.await();
            return status;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Set<String> scan(String segment) {
        List<String> terminalIps = new LinkedList<>();
        /**
         * 网段转换ip链表
         */
        try {
            CountDownLatch countDownLatch = new CountDownLatch(terminalIps.size());
            Set<String> pingableIps = new ConcurrentSkipListSet<>();
            for (String terminalIp : terminalIps) {
                terminalService.scan(terminalIp, pingableIps, countDownLatch);
            }
            countDownLatch.await();
            return pingableIps;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
