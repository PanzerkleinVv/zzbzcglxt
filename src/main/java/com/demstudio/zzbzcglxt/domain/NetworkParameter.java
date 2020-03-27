package com.demstudio.zzbzcglxt.domain;

public class NetworkParameter {
    private String networkParameterId;

    private String networkParameterName;

    private Integer networkParameterUse;

    private Integer networkParameterGroup;

    private String networkParameterValue;

    public NetworkParameter(String networkParameterId, String networkParameterName, Integer networkParameterUse, Integer networkParameterGroup, String networkParameterValue) {
        this.networkParameterId = networkParameterId;
        this.networkParameterName = networkParameterName;
        this.networkParameterUse = networkParameterUse;
        this.networkParameterGroup = networkParameterGroup;
        this.networkParameterValue = networkParameterValue;
    }

    public NetworkParameter() {
        super();
    }

    public String getNetworkParameterId() {
        return networkParameterId;
    }

    public void setNetworkParameterId(String networkParameterId) {
        this.networkParameterId = networkParameterId == null ? null : networkParameterId.trim();
    }

    public String getNetworkParameterName() {
        return networkParameterName;
    }

    public void setNetworkParameterName(String networkParameterName) {
        this.networkParameterName = networkParameterName == null ? null : networkParameterName.trim();
    }

    public Integer getNetworkParameterUse() {
        return networkParameterUse;
    }

    public void setNetworkParameterUse(Integer networkParameterUse) {
        this.networkParameterUse = networkParameterUse;
    }

    public Integer getNetworkParameterGroup() {
        return networkParameterGroup;
    }

    public void setNetworkParameterGroup(Integer networkParameterGroup) {
        this.networkParameterGroup = networkParameterGroup;
    }

    public String getNetworkParameterValue() {
        return networkParameterValue;
    }

    public void setNetworkParameterValue(String networkParameterValue) {
        this.networkParameterValue = networkParameterValue == null ? null : networkParameterValue.trim();
    }

    public NetworkParameterExample toExample() {
        NetworkParameterExample example = new NetworkParameterExample();
        NetworkParameterExample.Criteria criteria = example.createCriteria();
        if (this.networkParameterUse != null) {
            criteria.andNetworkParameterUseNotEqualTo(3);
            if (this.networkParameterUse == 1) {
                criteria.andNetworkParameterUseNotEqualTo(2);
            } else if (this.networkParameterUse == 2) {
                criteria.andNetworkParameterUseNotEqualTo(1);
            }
        }
        if (this.networkParameterGroup != null) {
            criteria.andNetworkParameterGroupEqualTo(this.networkParameterGroup);
        }
        example.setOrderByClause("NETWORK_PARAMETER_NAME ASC");
        return example;
    }
}