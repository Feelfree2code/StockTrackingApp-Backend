package com.Feelfree2code.STA.model.viewModel;

import com.Feelfree2code.STA.common.UpdateVM;
import com.Feelfree2code.STA.common.enums.PartTypeEnum;

/**
 * PartUpdateVM
 */
public class PartUpdateVM extends UpdateVM {

    public PartTypeEnum partType;
    public String name;
    public String specs;
    public int amount;
}