package com.Feelfree2code.STA.model.viewModel;

import java.time.LocalDate;

import com.Feelfree2code.STA.common.BaseVM;

/**
 * PartBuyHistoryVM
 */
public class PartBuyHistoryVM extends BaseVM {

    public int partId;
    public LocalDate dateTime;
    public int amount;
    public double price;
}