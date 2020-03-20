package com.demstudio.zzbzcglxt.repository;

import com.demstudio.zzbzcglxt.domain.Ledger;
import com.demstudio.zzbzcglxt.domain.LedgerExample;
import com.demstudio.zzbzcglxt.vo.consumable.LedgerVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LedgerMapper {
    long countByExample(LedgerExample example);

    int deleteByExample(LedgerExample example);

    int deleteByPrimaryKey(String ledgerId);

    int insert(Ledger record);

    int insertSelective(Ledger record);

    List<Ledger> selectByExample(LedgerExample example);

    Ledger selectByPrimaryKey(String ledgerId);

    int updateByExampleSelective(@Param("record") Ledger record, @Param("example") LedgerExample example);

    int updateByExample(@Param("record") Ledger record, @Param("example") LedgerExample example);

    int updateByPrimaryKeySelective(Ledger record);

    int updateByPrimaryKey(Ledger record);

    List<LedgerVo> searchPage(LedgerExample example);

    List<Ledger> getSubConsumable(String consumableId);
}