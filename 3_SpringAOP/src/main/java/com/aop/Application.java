package com.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt =  SpringApplication.run(Application.class, args);
		MyApp ma =ctxt.getBean(MyApp.class);
		ma.myLogic();
		ma.journey();
		ma.give();
		ma.exe();
	}
}
