package com.Feelfree2code.STA.model.viewModel;

import com.Feelfree2code.STA.common.BaseVM;

import java.time.LocalDate;

/**
 * PartBuyHistoryVM
 */
public class PartBuyHistoryVM extends BaseVM {

    public int partId;
    public LocalDate dateTime;
    public int amount;
    public double price;
}