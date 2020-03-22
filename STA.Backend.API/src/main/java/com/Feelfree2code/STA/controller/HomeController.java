package com.Feelfree2code.STA.controller;

import com.Feelfree2code.STA.model.domain.UserDTO;
import com.Feelfree2code.STA.service.userService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HomeController {

	private final userService myService; 

	public HomeController(userService myService) {
		this.myService = myService;
	}

	@GetMapping("/")
	public Iterable<UserDTO> home() {
		return myService.get(false);
	}
}