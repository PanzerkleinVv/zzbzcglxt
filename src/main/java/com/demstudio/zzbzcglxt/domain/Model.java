package com.demstudio.zzbzcglxt.domain;

public class Model {
    private String modelId;

    private String modelBrand;

    private String modelName;

    public Model(String modelId, String modelBrand, String modelName) {
        this.modelId = modelId;
        this.modelBrand = modelBrand;
        this.modelName = modelName;
    }

    public Model() {
        super();
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId == null ? null : modelId.trim();
    }

    public String getModelBrand() {
        return modelBrand;
    }

    public void setModelBrand(String modelBrand) {
        this.modelBrand = modelBrand == null ? null : modelBrand.trim();
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }
}