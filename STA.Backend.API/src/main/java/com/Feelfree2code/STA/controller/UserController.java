package com.Feelfree2code.STA.controller;

import com.Feelfree2code.STA.model.viewModel.UserAddVM;
import com.Feelfree2code.STA.model.viewModel.UserVM;
import com.Feelfree2code.STA.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/api/user")
public class UserController {

	private IUserService service;

	public UserController(IUserService service) {
		this.service = service;
	}

	@GetMapping
	public List<UserVM> get() {
		return service.get(false);
	}

	@PostMapping
	public boolean getUserById(@RequestBody UserAddVM userAddVM) {
		return service.add(userAddVM);
	}
	
}