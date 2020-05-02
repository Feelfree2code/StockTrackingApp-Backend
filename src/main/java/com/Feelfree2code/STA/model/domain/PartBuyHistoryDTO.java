package com.Feelfree2code.STA.model.domain;

import com.Feelfree2code.STA.common.BaseDTO;

import javax.persistence.*;
import java.util.Date;

/**
 * PartBuyHistoryDTO
 */
@Entity
@Table(name = "PartBuyHistory")
public class PartBuyHistoryDTO extends BaseDTO {

    @Temporal(TemporalType.DATE)
    private Date dateTime;
    private Integer amount;
    private Double price;

    // F_KEYS

    @ManyToOne
    @JoinColumn(name = "fk_part")
    private PartDTO partId;

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
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

    public PartDTO getPartId() {
        return partId;
    }

    public void setPartId(PartDTO partId) {
        this.partId = partId;
    }

}