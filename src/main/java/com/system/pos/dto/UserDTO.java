package com.system.pos.dto;

import com.system.pos.model.User;
import jakarta.persistence.Column;

public class UserDTO {
    private Integer userId;
    private String name;
    private String uRole;

    public UserDTO(User user) {
        this.userId = user.getUserId();
        this.name = user.getName();
        this.uRole = user.getuRole();
    }

    public UserDTO() {
    }

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
