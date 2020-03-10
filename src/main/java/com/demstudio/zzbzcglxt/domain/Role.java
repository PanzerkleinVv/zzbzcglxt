package com.demstudio.zzbzcglxt.domain;

public class Role {
    private Integer roleId;

    private String roleName;

    private String roleSign;

    private String roleDesc;

    public Role(Integer roleId, String roleName, String roleSign, String roleDesc) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleSign = roleSign;
        this.roleDesc = roleDesc;
    }

    public Role() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleSign() {
        return roleSign;
    }

    public void setRoleSign(String roleSign) {
        this.roleSign = roleSign == null ? null : roleSign.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }
}