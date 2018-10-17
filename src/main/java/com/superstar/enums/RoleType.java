package com.superstar.enums;

/**
 * @Author: BillYu
 * @Description:
 * @Date: Created in 下午11:06 2018/10/16.
 */
public enum  RoleType {

    ROLE_ADMIN(1,"系统管理员"),
    ROLE_CUSTOMER(2,"客户"),
    ROLE_SHOPKEEPER(3,"店主"),
    ROLE_SERVICE(4,"客服");






    private int roleId;
    private String roleName;

     RoleType(int roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }


    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
