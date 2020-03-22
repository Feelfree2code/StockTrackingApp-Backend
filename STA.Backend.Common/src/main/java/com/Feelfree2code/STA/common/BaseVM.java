package com.Feelfree2code.STA.common;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * BaseVM
 */

@Entity
public class BaseVM {
}

@Entity
public class AddVM {
}

@Entity
public class UpdateVM {

    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
