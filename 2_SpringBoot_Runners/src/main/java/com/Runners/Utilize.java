package com.Runners;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Utilize implements ApplicationRunner{

	@Value("${user.admin.name}")
	String name;
	
	@Value("${user.admin.pass}")
	String pass;
	
	@Value("${user.admin.phone}")
	long phone;
	
	@Value("${user.name}") // it will get the system name as output
	String name2;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("User name : "+name);
		System.out.println("User pass : "+pass);
		System.out.println("User phone: " +phone);
		System.out.println("Sys name :"+name2);
	}

	
}
