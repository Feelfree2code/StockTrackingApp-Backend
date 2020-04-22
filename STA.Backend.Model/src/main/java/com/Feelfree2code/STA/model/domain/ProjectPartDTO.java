package com.Feelfree2code.STA.model.domain;

import com.Feelfree2code.STA.common.BaseDTO;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ProjectPartDTO
 */
@Entity
@Table(name = "Project_Part_DTO")
public class ProjectPartDTO extends BaseDTO {
    
    private Integer amount;

    // F_KEY
       
    @ManyToOne
    @JoinColumn(name="fk_project")
    private ProjectDTO project_id;
       
    @ManyToOne
    @JoinColumn(name="fk_part")
    private PartDTO part_id;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public ProjectDTO getProject_id() {
        return project_id;
    }

    public void setProject_id(ProjectDTO project_id) {
        this.project_id = project_id;
    }

    public PartDTO getPart_id() {
        return part_id;
    }

    public void setPart_id(PartDTO part_id) {
        this.part_id = part_id;
    }

    
}