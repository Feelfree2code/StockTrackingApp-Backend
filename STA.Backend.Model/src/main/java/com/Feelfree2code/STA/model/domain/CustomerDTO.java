package com.Feelfree2code.STA.model.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.Feelfree2code.STA.common.BaseDTO;

/**
 * CustomerDTO
 */
@Entity
@Table(name="Customer")
public class CustomerDTO extends BaseDTO {

    private String first_name;
    private String last_name;
    private String phone_number;
    private String email;

    // F_KEYS

    @OneToMany(mappedBy="customer_id", cascade = CascadeType.ALL)
    Set<ProjectContactDTO> projectContactDTO = new HashSet<>();

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<ProjectContactDTO> getProjectContactDTO() {
        return projectContactDTO;
    }

    public void setProjectContactDTO(Set<ProjectContactDTO> projectContactDTO) {
        this.projectContactDTO = projectContactDTO;
    }

}