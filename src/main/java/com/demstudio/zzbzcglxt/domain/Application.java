package com.demstudio.zzbzcglxt.domain;

public class Application {
    private String applicationId;

    private String applicationName;

    private String applicationServer;

    private String applicationGate;

    private String applicationDesc;

    public Application(String applicationId, String applicationName, String applicationServer, String applicationGate, String applicationDesc) {
        this.applicationId = applicationId;
        this.applicationName = applicationName;
        this.applicationServer = applicationServer;
        this.applicationGate = applicationGate;
        this.applicationDesc = applicationDesc;
    }

    public Application() {
        super();
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId == null ? null : applicationId.trim();
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName == null ? null : applicationName.trim();
    }

    public String getApplicationServer() {
        return applicationServer;
    }

    public void setApplicationServer(String applicationServer) {
        this.applicationServer = applicationServer == null ? null : applicationServer.trim();
    }

    public String getApplicationGate() {
        return applicationGate;
    }

    public void setApplicationGate(String applicationGate) {
        this.applicationGate = applicationGate == null ? null : applicationGate.trim();
    }

    public String getApplicationDesc() {
        return applicationDesc;
    }

    public void setApplicationDesc(String applicationDesc) {
        this.applicationDesc = applicationDesc == null ? null : applicationDesc.trim();
    }
}