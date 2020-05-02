package com.Feelfree2code.STA.model.domain;

import com.Feelfree2code.STA.common.BaseDTO;
import com.Feelfree2code.STA.common.enums.PartTypeEnum;

import javax.persistence.*;

/**
 * PartDTO
 */
@Entity
@Table(name="Part")
public class PartDTO extends BaseDTO {

    @Column(length = 32, columnDefinition = "varchar(32) default 'NotDefined'")
    @Enumerated(value = EnumType.STRING)
    private PartTypeEnum partType = PartTypeEnum.NotDefined;
    private String name;
    private String specs;
    private Integer amount;

    public PartTypeEnum getPartType() {
        return partType;
    }

    public void setPartType(PartTypeEnum partType) {
        this.partType = partType;
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

}