package com.aop;

import java.io.FileWriter;
import java.io.IOException;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogRecord {
	
	FileWriter fw ;
	
	// Types of Advices
	
	@Before("execution(public void myLogic())")
	public void recordEntry() {
		try {
			fw = new FileWriter("C:\\Users\\Hari Priya\\Desktop\\Demo\\Log.text");
			fw.write("Method started........."+System.lineSeparator());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Method started");
	}
	
	@After("execution(public void myLogic())")
	public void recordExit() {
		try {
			fw.write("Method ended........."+System.lineSeparator());
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("method ended");	
	}

	@Around("execution(public void journey())")
	public void securityCheck(ProceedingJoinPoint pjp) {
		System.out.println("security check in india");
		try {
			pjp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}	
		System.out.println("imigration check");
	}
	
	@AfterReturning(pointcut = "execution(public String give())", returning = "s")
	void hold(String s) {
		System.out.println("value: "+ s);
	}
	
	@AfterThrowing(pointcut="execution(public void exe())",throwing = "e")
	void getExc(Exception e){
		System.out.println("Exception is recorded");
	}
	
}
