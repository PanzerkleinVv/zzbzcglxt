package com.demstudio.zzbzcglxt.service.network;

import com.demstudio.zzbzcglxt.domain.Terminal;
import com.demstudio.zzbzcglxt.domain.TerminalExample;
import com.demstudio.zzbzcglxt.vo.Message;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public interface TerminalService {
    List<Terminal> search(TerminalExample example);

    boolean edit(Terminal terminal);

    boolean checkIp(Terminal terminal);

    boolean delete(String terminalId);

    void ping(String terminalIp, Map<String, Boolean> status, CountDownLatch countDownLatch) throws Exception;

    void scan(String terminalIp, Set<String> pingableIps, CountDownLatch countDownLatch) throws Exception;
}
