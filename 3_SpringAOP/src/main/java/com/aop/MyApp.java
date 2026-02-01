package com.aop;

import org.springframework.stereotype.Component;

@Component
public class MyApp {
	
	public void myLogic() {
		System.out.println("This is business logic");
	}
	
	public void journey() {
		System.out.println("international trip");
	}
	
	public String  give() {
		return "hari";
	}

	public void exe() {
		throw new RuntimeException("My own exception");
	}
}
