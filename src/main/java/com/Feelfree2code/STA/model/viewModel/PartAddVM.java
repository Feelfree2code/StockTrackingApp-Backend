package com.Feelfree2code.STA.model.viewModel;

import com.Feelfree2code.STA.common.AddVM;
import com.Feelfree2code.STA.common.enums.PartTypeEnum;

/**
 * PartAddVM
 */
public class PartAddVM extends AddVM {

    public PartTypeEnum partType;
    public String name;
    public String specs;
    public int amount;
}