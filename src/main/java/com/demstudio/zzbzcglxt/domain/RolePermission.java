package com.demstudio.zzbzcglxt.domain;

public class RolePermission {
    private Integer id;

    private Integer roleId;

    private Integer permId;

    public RolePermission(Integer id, Integer roleId, Integer permId) {
        this.id = id;
        this.roleId = roleId;
        this.permId = permId;
    }

    public RolePermission() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermId() {
        return permId;
    }

    public void setPermId(Integer permId) {
        this.permId = permId;
    }
}