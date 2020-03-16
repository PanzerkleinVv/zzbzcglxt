package com.demstudio.zzbzcglxt.repository;

import com.demstudio.zzbzcglxt.domain.RegistrationReason;
import com.demstudio.zzbzcglxt.domain.RegistrationReasonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegistrationReasonMapper {
    long countByExample(RegistrationReasonExample example);

    int deleteByExample(RegistrationReasonExample example);

    int deleteByPrimaryKey(String registrationReasonId);

    int insert(RegistrationReason record);

    int insertSelective(RegistrationReason record);

    List<RegistrationReason> selectByExample(RegistrationReasonExample example);

    RegistrationReason selectByPrimaryKey(String registrationReasonId);

    int updateByExampleSelective(@Param("record") RegistrationReason record, @Param("example") RegistrationReasonExample example);

    int updateByExample(@Param("record") RegistrationReason record, @Param("example") RegistrationReasonExample example);

    int updateByPrimaryKeySelective(RegistrationReason record);

    int updateByPrimaryKey(RegistrationReason record);

    List<RegistrationReason> searchPage(RegistrationReasonExample example);
}