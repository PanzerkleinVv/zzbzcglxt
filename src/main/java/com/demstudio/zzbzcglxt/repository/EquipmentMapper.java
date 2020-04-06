package com.demstudio.zzbzcglxt.repository;

import com.demstudio.zzbzcglxt.domain.Equipment;
import com.demstudio.zzbzcglxt.domain.EquipmentExample;

import java.util.List;

import com.demstudio.zzbzcglxt.vo.equipment.EquipmentVo;
import org.apache.ibatis.annotations.Param;

public interface EquipmentMapper {
  long countByExample(EquipmentExample example);

  int deleteByExample(EquipmentExample example);

  int deleteByPrimaryKey(String equipmentId);

  int insert(Equipment record);

  int insertSelective(Equipment record);

  List<Equipment> selectByExample(EquipmentExample example);

  Equipment selectByPrimaryKey(String equipmentId);

  int updateByExampleSelective(@Param("record") Equipment record, @Param("example") EquipmentExample example);

  int updateByExample(@Param("record") Equipment record, @Param("example") EquipmentExample example);

  int updateByPrimaryKeySelective(Equipment record);

  int updateByPrimaryKey(Equipment record);

  List<EquipmentVo> searchPage(EquipmentExample example);

  EquipmentVo admin(String equipmentId);
}
