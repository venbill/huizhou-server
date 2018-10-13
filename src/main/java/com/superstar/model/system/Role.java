package com.superstar.model.system;

public class Role {
    private Integer roleId;

    private String roleName;

    private String roleCname;

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

    public String getRoleCname() {
        return roleCname;
    }

    public void setRoleCname(String roleCname) {
        this.roleCname = roleCname == null ? null : roleCname.trim();
    }
}