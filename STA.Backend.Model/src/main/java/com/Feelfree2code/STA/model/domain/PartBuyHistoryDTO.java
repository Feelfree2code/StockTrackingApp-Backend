package com.Feelfree2code.STA.model.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.Feelfree2code.STA.common.BaseDTO;

/**
 * PartBuyHistoryDTO
 */
@Entity
@Table(name="PartBuyHistory")
public class PartBuyHistoryDTO extends BaseDTO {


    private LocalDate date_time;
    private Integer amount;
    private Double price;

    // F_KEYS

    @ManyToOne
    @JoinColumn(name="fk_part")
    private PartDTO part_id;

    public LocalDate getDate_time() {
        return date_time;
    }

    public void setDate_time(LocalDate date_time) {
        this.date_time = date_time;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public PartDTO getPart_id() {
        return part_id;
    }

    public void setPart_id(PartDTO part_id) {
        this.part_id = part_id;
    }

    
}