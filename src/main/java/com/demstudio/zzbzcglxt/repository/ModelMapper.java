package com.demstudio.zzbzcglxt.repository;

import com.demstudio.zzbzcglxt.domain.Model;
import com.demstudio.zzbzcglxt.domain.ModelExample;
import com.demstudio.zzbzcglxt.vo.equipment.ModelVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ModelMapper {
  long countByExample(ModelExample example);

  int deleteByExample(ModelExample example);

  int deleteByPrimaryKey(String modelId);

  int insert(Model record);

  int insertSelective(Model record);

  List<Model> selectByExample(ModelExample example);

  Model selectByPrimaryKey(String modelId);

  int updateByExampleSelective(@Param("record") Model record, @Param("example") ModelExample example);

  int updateByExample(@Param("record") Model record, @Param("example") ModelExample example);

  int updateByPrimaryKeySelective(Model record);

  int updateByPrimaryKey(Model record);

  List<ModelVo> searchPage(ModelExample example);

  List<Model> list(String modelBrand);
}
