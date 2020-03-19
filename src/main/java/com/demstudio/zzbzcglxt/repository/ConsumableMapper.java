package com.demstudio.zzbzcglxt.repository;

import com.demstudio.zzbzcglxt.domain.Consumable;
import com.demstudio.zzbzcglxt.domain.ConsumableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConsumableMapper {
    long countByExample(ConsumableExample example);

    int deleteByExample(ConsumableExample example);

    int deleteByPrimaryKey(String consumableId);

    int insert(Consumable record);

    int insertSelective(Consumable record);

    List<Consumable> selectByExample(ConsumableExample example);

    Consumable selectByPrimaryKey(String consumableId);

    int updateByExampleSelective(@Param("record") Consumable record, @Param("example") ConsumableExample example);

    int updateByExample(@Param("record") Consumable record, @Param("example") ConsumableExample example);

    int updateByPrimaryKeySelective(Consumable record);

    int updateByPrimaryKey(Consumable record);

    List<Consumable> searchPage(ConsumableExample example);

    boolean addCount(Consumable consumable);
}