package com.masm.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.masm.didemo.controllers.MyController;

@SpringBootApplication
public class DiDemoSpringApplication {
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoSpringApplication.class, args);
		
		MyController myController = (MyController) ctx.getBean("myController");
		
		myController.hello();
	}
	
}
