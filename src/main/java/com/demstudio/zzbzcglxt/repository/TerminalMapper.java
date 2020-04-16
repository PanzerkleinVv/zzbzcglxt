package com.demstudio.zzbzcglxt.repository;

import com.demstudio.zzbzcglxt.domain.Terminal;
import com.demstudio.zzbzcglxt.domain.TerminalExample;
import com.demstudio.zzbzcglxt.vo.network.TerminalVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TerminalMapper {
  long countByExample(TerminalExample example);

  int deleteByExample(TerminalExample example);

  int deleteByPrimaryKey(String terminalId);

  int insert(Terminal record);

  int insertSelective(Terminal record);

  List<Terminal> selectByExample(TerminalExample example);

  Terminal selectByPrimaryKey(String terminalId);

  int updateByExampleSelective(@Param("record") Terminal record, @Param("example") TerminalExample example);

  int updateByExample(@Param("record") Terminal record, @Param("example") TerminalExample example);

  int updateByPrimaryKeySelective(Terminal record);

  int updateByPrimaryKey(Terminal record);

  List<TerminalVo> selectVoByExample(TerminalExample example);
}
