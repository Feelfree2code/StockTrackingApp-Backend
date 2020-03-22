package com.Feelfree2code.STA.model.domain;

import javax.persistence.OneToMany;

import com.Feelfree2code.STA.common.BaseDTO;

/**
 * ProjectPartDTO
 */
public class ProjectPartDTO extends BaseDTO {
    
    private Integer amount;

    // F_KEY

    @OneToMany(mappedBy = "projectPartDTO")
    private ProjectDTO project_id;

    @OneToMany(mappedBy = "projectPartDTO")
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