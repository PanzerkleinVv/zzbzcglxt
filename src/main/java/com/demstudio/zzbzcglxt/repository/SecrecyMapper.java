package com.demstudio.zzbzcglxt.repository;

import com.demstudio.zzbzcglxt.domain.Secrecy;
import com.demstudio.zzbzcglxt.domain.SecrecyExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SecrecyMapper {
  long countByExample(SecrecyExample example);

  int deleteByExample(SecrecyExample example);

  int deleteByPrimaryKey(String secrecyId);

  int insert(Secrecy record);

  int insertSelective(Secrecy record);

  List<Secrecy> selectByExample(SecrecyExample example);

  Secrecy selectByPrimaryKey(String secrecyId);

  int updateByExampleSelective(@Param("record") Secrecy record, @Param("example") SecrecyExample example);

  int updateByExample(@Param("record") Secrecy record, @Param("example") SecrecyExample example);

  int updateByPrimaryKeySelective(Secrecy record);

  int updateByPrimaryKey(Secrecy record);

  List<Secrecy> searchPage(SecrecyExample example);
}
