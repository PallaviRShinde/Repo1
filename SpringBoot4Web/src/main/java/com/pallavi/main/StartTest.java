package com.pallavi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.pallavi")
public class StartTest {

	public static void main(String[] args) {
		SpringApplication.run(StartTest.class,args);
	}
	
}
