package com.Feelfree2code.STA.model.domain;

import java.time.LocalDate;

import javax.persistence.JoinColumn;

import com.Feelfree2code.STA.common.BaseDTO;

/**
 * ProjectDTO
 */
public class ProjectDTO extends BaseDTO {

    private LocalDate start_time;
    private LocalDate end_time;
    private String title;
    private String address;

    // F_KEYS
    
    @JoinColumn(name = "contact_fk", referencedColumnName = "id")
    private ProjectContactDTO projectContactDTO;

    @JoinColumn(name = "project_part_fk", referencedColumnName = "id")
    private ProjectPartDTO projectPartDTO;

    public LocalDate getStart_time() {
        return start_time;
    }

    public void setStart_time(LocalDate start_time) {
        this.start_time = start_time;
    }

    public LocalDate getEnd_time() {
        return end_time;
    }

    public void setEnd_time(LocalDate end_time) {
        this.end_time = end_time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
}