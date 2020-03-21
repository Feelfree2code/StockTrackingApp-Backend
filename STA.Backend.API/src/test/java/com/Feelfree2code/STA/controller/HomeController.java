package com.Feelfree2code.STA.controller;

import static org.assertj.core.api.Assertions.assertThat;

import com.Feelfree2code.STA.service.MyService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HomeController {

	@Autowired
	private MyService myService;

	@Test
	public void contextLoads() {
		assertThat(myService.message()).isNotNull();
	}

}
