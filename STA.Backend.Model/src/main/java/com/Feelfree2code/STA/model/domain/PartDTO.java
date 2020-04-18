package com.Feelfree2code.STA.model.domain;

import com.Feelfree2code.STA.common.BaseDTO;
import com.Feelfree2code.STA.common.enums.PartTypeEnum;

import javax.persistence.*;

/**
 * PartDTO
 */
public class PartDTO extends BaseDTO {

    @Column(length = 32, columnDefinition = "varchar(32) default 'NotDefined'")
    @Enumerated(value = EnumType.STRING)
    private PartTypeEnum part_type = PartTypeEnum.NotDefined;
    private String name;
    private String specs;
    private Integer amount;

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

}