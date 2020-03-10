package com.demstudio.zzbzcglxt.domain;

public class Secrecy {
    private String secrecyId;

    private String secrecyName;

    private Integer ipMin;

    private Integer ipMax;

    public Secrecy(String secrecyId, String secrecyName, Integer ipMin, Integer ipMax) {
        this.secrecyId = secrecyId;
        this.secrecyName = secrecyName;
        this.ipMin = ipMin;
        this.ipMax = ipMax;
    }

    public Secrecy() {
        super();
    }

    public String getSecrecyId() {
        return secrecyId;
    }

    public void setSecrecyId(String secrecyId) {
        this.secrecyId = secrecyId == null ? null : secrecyId.trim();
    }

    public String getSecrecyName() {
        return secrecyName;
    }

    public void setSecrecyName(String secrecyName) {
        this.secrecyName = secrecyName == null ? null : secrecyName.trim();
    }

    public Integer getIpMin() {
        return ipMin;
    }

    public void setIpMin(Integer ipMin) {
        this.ipMin = ipMin;
    }

    public Integer getIpMax() {
        return ipMax;
    }

    public void setIpMax(Integer ipMax) {
        this.ipMax = ipMax;
    }
}