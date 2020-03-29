package com.Feelfree2code.STA.controller;

import com.Feelfree2code.STA.model.domain.UserDTO;
import com.Feelfree2code.STA.model.viewModel.UserAddVM;
import com.Feelfree2code.STA.model.viewModel.UserUpdateVM;
import com.Feelfree2code.STA.model.viewModel.UserVM;
import com.Feelfree2code.STA.subStructure.BaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HomeController {

	// private final userService myService; 
    @Autowired
	private BaseService<UserDTO,UserVM,UserAddVM,UserUpdateVM,Integer> baseService;
	
	public HomeController() {
		// this.myService = myService;
	}

	@GetMapping("/")
	public Iterable<UserDTO> home() {
		// return myService.get(false);
		return baseService.get(false);
	}
}