package com.Feelfree2code.STA.model.viewModel;

import com.Feelfree2code.STA.common.AddVM;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * UserAddVM
 */
public class UserAddVM extends AddVM {
    @NotEmpty
    @Size(min=4, max=15)
    public String userName;
    @NotEmpty
    @Size(min=6, max=25)
    public String email;
    public boolean isAdmin;
}