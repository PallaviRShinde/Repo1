package com.pallavi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WebController {

	@RequestMapping("/hello")
	public String method2()
	{
		System.out.println("Inside Controller");
		return "success";
	}
	@RequestMapping("/")
	public String method1()
	{
		System.out.println("Welcome ....");
		return "index";
	}
}
