package com.Feelfree2code.STA.common;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * BaseDTO
 */

@MappedSuperclass 
public class BaseDTO {

    @Id
    @GeneratedValue
    private Integer id;

    private boolean is_deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    
}