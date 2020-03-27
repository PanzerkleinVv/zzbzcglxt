package com.demstudio.zzbzcglxt.service.equipment.impl;

import com.demstudio.zzbzcglxt.domain.Type;
import com.demstudio.zzbzcglxt.domain.TypeExample;
import com.demstudio.zzbzcglxt.repository.TypeMapper;
import com.demstudio.zzbzcglxt.service.equipment.TypeService;
import com.demstudio.zzbzcglxt.utils.PageUtils;
import com.demstudio.zzbzcglxt.vo.PageRequest;
import com.demstudio.zzbzcglxt.vo.PageResult;
import com.demstudio.zzbzcglxt.vo.equipment.TypeExtend;
import com.demstudio.zzbzcglxt.vo.equipment.TypeVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class TypeServiceImpl implements TypeService {

    @Resource
    private TypeMapper typeMapper;

    @Override
    public PageResult searchPage(PageRequest pageRequest, TypeExample example) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest, example));
    }

    @Override
    public Type info(String typeId) {
        return typeMapper.selectByPrimaryKey(typeId);
    }

    @Override
    public boolean edit(Type type) {
        if (type.getTypeId() != null && !"".equals(type.getTypeId())) {
            return 1 == typeMapper.updateByPrimaryKeySelective(type);
        } else {
            type.setTypeId(DigestUtils.sha1Hex(UUID.randomUUID().toString()));
            return 1 == typeMapper.insertSelective(type);
        }
    }

    @Override
    public List<TypeExtend> list(Type type) {
        TypeExample example = new TypeExample();
        if (type != null) {
            if (type.getTypeBrand()) {
                example.createCriteria().andTypeBrandEqualTo(true);
            }
            if (type.getTypeModel()) {
                example.createCriteria().andTypeModelEqualTo(true);
            }
        }
        return typeMapper.list(example);
    }

    private PageInfo<TypeVo> getPageInfo(PageRequest pageRequest, TypeExample example) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<TypeVo> types = typeMapper.searchPage(example);
        return new PageInfo<>(types);
    }
}
