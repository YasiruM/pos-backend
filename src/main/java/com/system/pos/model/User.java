package com.system.pos.model;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="userId", nullable = false, updatable = false)
    private Integer userId;
    @Column(name="name")
    private String name;
    @Column(name="uRole")
    private String uRole;
    @Column(name="userName")
    private String userName;
    @Column(name="password")
    private String password;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getuRole() {
        return uRole;
    }

    public void setuRole(String uRole) {
        this.uRole = uRole;
    }
}
