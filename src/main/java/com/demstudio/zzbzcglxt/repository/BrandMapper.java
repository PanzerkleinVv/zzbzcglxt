package com.demstudio.zzbzcglxt.repository;

import com.demstudio.zzbzcglxt.domain.Brand;
import com.demstudio.zzbzcglxt.domain.BrandExample;
import com.demstudio.zzbzcglxt.vo.equipment.BrandModel;
import com.demstudio.zzbzcglxt.vo.equipment.BrandVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandMapper {
    long countByExample(BrandExample example);

    int deleteByExample(BrandExample example);

    int deleteByPrimaryKey(String brandId);

    int insert(Brand record);

    int insertSelective(Brand record);

    List<Brand> selectByExample(BrandExample example);

    Brand selectByPrimaryKey(String brandId);

    int updateByExampleSelective(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByExample(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);

    List<BrandVo> searchPage(BrandExample example);

    List<BrandModel> list(String brandType);
}