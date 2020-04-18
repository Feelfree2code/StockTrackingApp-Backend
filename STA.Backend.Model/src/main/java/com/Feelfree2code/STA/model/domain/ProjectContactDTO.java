package com.Feelfree2code.STA.model.domain;

import com.Feelfree2code.STA.common.BaseDTO;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ProjectContactDTO
 */
@Entity
@Table(name = "ProjectContact")
public class ProjectContactDTO extends BaseDTO {

    private Integer priorty_index;
    
    // F_KEYS
    @ManyToOne
    @JoinColumn(name = "fk_project")
    private ProjectDTO project_id;

    @ManyToOne
    @JoinColumn(name = "fk_customer")
    private CustomerDTO customer_id;


    public Integer getPriorty_index() {
        return priorty_index;
    }

    public void setPriorty_index(Integer priorty_index) {
        this.priorty_index = priorty_index;
    }

    public ProjectDTO getProject_id() {
        return project_id;
    }

    public void setProject_id(ProjectDTO project_id) {
        this.project_id = project_id;
    }

    public CustomerDTO getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(CustomerDTO customer_id) {
        this.customer_id = customer_id;
    }

}