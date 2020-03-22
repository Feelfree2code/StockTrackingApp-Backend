package com.Feelfree2code.STA.model.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.Feelfree2code.STA.common.BaseDTO;
import com.Feelfree2code.STA.common.enums.PartTypeEnum;

/**
 * PartDTO
 */
@Entity
@Table(name="Part")
public class PartDTO extends BaseDTO {

    @Column(length = 32, columnDefinition = "varchar(32) default 'NotDefined'")
    @Enumerated(value = EnumType.STRING)
    private PartTypeEnum part_type = PartTypeEnum.NotDefined;
    private String name;
    private String specs;
    private Integer amount;

    // F_KEYS

    @OneToMany(mappedBy="part_id", cascade = CascadeType.ALL)
    Set<PartBuyHistoryDTO> partBuyHistoryDTO = new HashSet<>();

    @OneToMany(mappedBy="part_id", cascade = CascadeType.ALL)
    Set<ProjectPartDTO> projectPartDTO = new HashSet<>();
    
    public PartTypeEnum getPart_type() {
        return part_type;
    }

    public void setPart_type(PartTypeEnum part_type) {
        this.part_type = part_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Set<PartBuyHistoryDTO> getPartBuyHistoryDTO() {
        return partBuyHistoryDTO;
    }

    public void setPartBuyHistoryDTO(Set<PartBuyHistoryDTO> partBuyHistoryDTO) {
        this.partBuyHistoryDTO = partBuyHistoryDTO;
    }

    public Set<ProjectPartDTO> getProjectPartDTO() {
        return projectPartDTO;
    }

    public void setProjectPartDTO(Set<ProjectPartDTO> projectPartDTO) {
        this.projectPartDTO = projectPartDTO;
    }

}