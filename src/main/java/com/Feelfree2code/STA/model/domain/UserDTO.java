package com.Feelfree2code.STA.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.Feelfree2code.STA.common.BaseDTO;

/**
 * UserDTO
 */
@Entity
@Table(name="UserTable")
public class UserDTO extends BaseDTO {  
    private String userName;
    private String email;
    private boolean isAdmin;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}