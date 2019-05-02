package com.pallavi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
@RequestMapping("/")
	public String test()
	{
		return "Hello World";
	}
}
