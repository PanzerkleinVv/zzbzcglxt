package com.demstudio.zzbzcglxt.service.equipment.impl;

import com.demstudio.zzbzcglxt.domain.Equipment;
import com.demstudio.zzbzcglxt.domain.EquipmentExample;
import com.demstudio.zzbzcglxt.repository.EquipmentMapper;
import com.demstudio.zzbzcglxt.service.equipment.EquipmentService;
import com.demstudio.zzbzcglxt.utils.PageUtils;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.demstudio.zzbzcglxt.vo.equipment.EquipmentVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Resource
    private EquipmentMapper equipmentMapper;

    @Override
    public PageResult searchPage(PageRequest pageRequest, EquipmentExample example) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest, example));
    }

    @Override
    public Equipment info(String equipmentId) {
        return equipmentMapper.selectByPrimaryKey(equipmentId);
    }

    @Override
    public EquipmentVo admin(String equipmentId) {
        return equipmentMapper.admin(equipmentId);
    }

    @Override
    public boolean delete(String equipmentId) {
        return 1 == equipmentMapper.deleteByPrimaryKey(equipmentId);
    }

    @Override
    public Boolean checkEquipmentName(Equipment equipment) {
        EquipmentExample example = new EquipmentExample();
        example.createCriteria().andEquipmentNameEqualTo(equipment.getEquipmentName()).andEquipmentIdNotEqualTo(equipment.getEquipmentId());
        return equipmentMapper.countByExample(example) == 0;
    }

    @Override
    public boolean edit(Equipment equipment) {
        if (equipment.getEquipmentId() != null && !"".equals(equipment.getEquipmentId())) {
            return 1 == equipmentMapper.updateByPrimaryKeySelective(equipment);
        } else {
            equipment.setEquipmentId(DigestUtils.sha1Hex(UUID.randomUUID().toString()));
            return 1 == equipmentMapper.insertSelective(equipment);
        }
    }

    private PageInfo<EquipmentVo> getPageInfo(PageRequest pageRequest, EquipmentExample example) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<EquipmentVo> brands = equipmentMapper.searchPage(example);
        return new PageInfo<>(brands);
    }
}
