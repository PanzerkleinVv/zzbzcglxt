package com.demstudio.zzbzcglxt.biz;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface AsyncTerminalBiz {
    Map<String, Boolean> ping(List<String> terminalIps);

    Set<String> scan(String segment);
}
