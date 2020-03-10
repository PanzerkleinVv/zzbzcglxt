package com.demstudio.zzbzcglxt.domain;

public class RegistrationReason {
    private String registrationReasonId;

    private String registrationReasonName;

    private Boolean registrationReasonNote;

    public RegistrationReason(String registrationReasonId, String registrationReasonName, Boolean registrationReasonNote) {
        this.registrationReasonId = registrationReasonId;
        this.registrationReasonName = registrationReasonName;
        this.registrationReasonNote = registrationReasonNote;
    }

    public RegistrationReason() {
        super();
    }

    public String getRegistrationReasonId() {
        return registrationReasonId;
    }

    public void setRegistrationReasonId(String registrationReasonId) {
        this.registrationReasonId = registrationReasonId == null ? null : registrationReasonId.trim();
    }

    public String getRegistrationReasonName() {
        return registrationReasonName;
    }

    public void setRegistrationReasonName(String registrationReasonName) {
        this.registrationReasonName = registrationReasonName == null ? null : registrationReasonName.trim();
    }

    public Boolean getRegistrationReasonNote() {
        return registrationReasonNote;
    }

    public void setRegistrationReasonNote(Boolean registrationReasonNote) {
        this.registrationReasonNote = registrationReasonNote;
    }
}