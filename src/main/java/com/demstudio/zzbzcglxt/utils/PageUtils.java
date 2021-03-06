package com.demstudio.zzbzcglxt.utils;

import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.github.pagehelper.PageInfo;

public class PageUtils {
  /**
   * 将分页信息封装到统一的接口
   *
   * @param pageRequest pageRequest
   * @param pageInfo    pageInfo
   * @return PageResult
   */
  public static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo) {
    PageResult pageResult = new PageResult();
    pageResult.setPageNum(pageInfo.getPageNum());
    pageResult.setPageSize(pageInfo.getPageSize());
    pageResult.setTotalSize(pageInfo.getTotal());
    pageResult.setTotalPages(pageInfo.getPages());
    pageResult.setContent(pageInfo.getList());
    return pageResult;
  }
}
