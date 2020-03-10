package com.demstudio.zzbzcglxt.domain;

public class User {
    private String userId;

    private String userName;

    private String userPsw;

    private Integer userRoleId;

    private String userDesc;

    public User(String userId, String userName, String userPsw, Integer userRoleId, String userDesc) {
        this.userId = userId;
        this.userName = userName;
        this.userPsw = userPsw;
        this.userRoleId = userRoleId;
        this.userDesc = userDesc;
    }

    public User() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPsw() {
        return userPsw;
    }

    public void setUserPsw(String userPsw) {
        this.userPsw = userPsw == null ? null : userPsw.trim();
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc == null ? null : userDesc.trim();
    }
}