package com.Feelfree2code.STA.model.domain;

import javax.persistence.Entity;

import com.Feelfree2code.STA.common.BaseDTO;

/**
 * UserDTO
 */
@Entity
public class UserDTO extends BaseDTO {

    private String user_name;
    private String email;
    private boolean is_admin;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIs_admin() {
        return is_admin;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }

    
}