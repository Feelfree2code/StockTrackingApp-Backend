package com.Feelfree2code.STA.controller;

import com.Feelfree2code.STA.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.Feelfree2code.STA")
@RestController 
public class HomeController {

	private final MyService myService; 

	public HomeController(MyService myService) {
		this.myService = myService;
	}

	@GetMapping("/")
	public String home() {
		return myService.message();
	}

	public static void main(String[] args) {
		SpringApplication.run(HomeController.class, args);
	}
}