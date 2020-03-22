package com.Feelfree2code.STA.model.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.Feelfree2code.STA.common.BaseDTO;

/**
 * ProjectDTO
 */
@Entity
@Table(name="Project")
public class ProjectDTO extends BaseDTO {

    private LocalDate start_time;
    private LocalDate end_time;
    private String title;
    private String address;

    // F_KEYS
    
    @OneToMany(mappedBy="project_id", cascade = CascadeType.ALL)
    Set<ProjectContactDTO> projectContactDTO = new HashSet<>();

    @OneToMany(mappedBy="project_id", cascade = CascadeType.ALL)
    Set<ProjectPartDTO> projectPartDTO = new HashSet<>();

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

    public Set<ProjectContactDTO> getProjectContactDTO() {
        return projectContactDTO;
    }

    public void setProjectContactDTO(Set<ProjectContactDTO> projectContactDTO) {
        this.projectContactDTO = projectContactDTO;
    }

    public Set<ProjectPartDTO> getProjectPartDTO() {
        return projectPartDTO;
    }

    public void setProjectPartDTO(Set<ProjectPartDTO> projectPartDTO) {
        this.projectPartDTO = projectPartDTO;
    }

    
}