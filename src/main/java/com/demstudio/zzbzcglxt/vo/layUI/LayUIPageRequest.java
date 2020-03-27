package com.demstudio.zzbzcglxt.vo.layUI;

import com.demstudio.zzbzcglxt.vo.PageRequest;

public class LayUIPageRequest extends PageRequest {
    /**
     * 当前页码
     */
    private int page;
    /**
     * 每页数量
     */
    private int limit;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public int getPageNum() {
        return page;
    }

    @Override
    public int getPageSize() {
        return limit;
    }
}
