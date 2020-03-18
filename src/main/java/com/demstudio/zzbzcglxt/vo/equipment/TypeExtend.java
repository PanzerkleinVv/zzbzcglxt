package com.demstudio.zzbzcglxt.vo.equipment;

import com.demstudio.zzbzcglxt.domain.Type;

import java.util.List;

public class TypeExtend extends Type {

    private List<BrandModel> brands;

    public TypeExtend() {
        super();
    }

    public TypeExtend(String typeId, String typeName, Boolean typeBrand, Boolean typeModel, Boolean typeSecrecy, Boolean typeIp, Boolean typeMac, Boolean typeSn) {
        super(typeId, typeName, typeBrand, typeModel, typeSecrecy, typeIp, typeMac, typeSn);
    }

    public TypeExtend(String typeId, String typeName, Boolean typeBrand, Boolean typeModel, Boolean typeSecrecy, Boolean typeIp, Boolean typeMac, Boolean typeSn, List<BrandModel> brands) {
        super(typeId, typeName, typeBrand, typeModel, typeSecrecy, typeIp, typeMac, typeSn);
        this.brands = brands;
    }

    public List<BrandModel> getBrands() {
        return brands;
    }

    public void setBrands(List<BrandModel> brands) {
        this.brands = brands;
    }
}
