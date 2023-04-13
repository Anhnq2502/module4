package com.example.spring_security.model;

import javax.persistence.*;

@Entity
@Table(name = "app_role")
public class AppRole {
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleID;
    @Column(name = "role_name")
    private String roleName;

    public AppRole() {
    }

    public AppRole(Integer roleID, String roleName) {
        this.roleID = roleID;
        this.roleName = roleName;
    }

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
