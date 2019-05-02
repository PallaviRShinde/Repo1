package com.pallavi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	@RequestMapping("/")
public String test()
{
		System.out.println("IN FirstController");
	return "Welcome in Spring Boot";
}
}
