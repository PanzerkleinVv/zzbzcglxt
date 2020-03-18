package com.demstudio.zzbzcglxt.vo.equipment;

import com.demstudio.zzbzcglxt.domain.Brand;
import com.demstudio.zzbzcglxt.domain.Model;

import java.util.List;

public class BrandModel extends Brand {

    private List<Model> models;

    public BrandModel() {
        super();
    }

    public BrandModel(String brandId, String brandType, String brandName) {
        super(brandId, brandType, brandName);
    }

    public BrandModel(String brandId, String brandType, String brandName, List<Model> models) {
        super(brandId, brandType, brandName);
        this.models = models;
    }

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }
}
