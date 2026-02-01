package com.jpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.jpa.Entity.Employee;
import com.jpa.repo.EmployeeRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		
		EmployeeRepo repo = ctxt.getBean(EmployeeRepo.class);
		
		Employee e1= new Employee(1001,"Chota Bheem",45000,"dolakpur");
		Employee e2= new Employee(1002,"AntMan",50000,"Sugar");
		Employee e3= new Employee(1003,"Shazam",80000,"Power");
		Employee e4= new Employee(1004,"Doraemon",65000,"Gadgets");
		Employee e5= new Employee(1005,"Indumathi",45000,"dolakpur");
		Employee e6= new Employee(1006,"kazama",65000,"show off");
		Employee e7= new Employee(1007,"hhimawari",20000,"baby");
		Employee e8= new Employee(1008,"oogy",65000,"fight");
		Employee e9= new Employee(1009,"Chutki",75000,"dolakpur");
		Employee e10= new Employee(1010,"Sunio",90000,"Rich");
//		repo.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10));
//		System.out.println("Records inserted...");
		
		List<Employee> allEmps=null;
		
//		allEmps =repo.findAll();
//		allEmps.forEach(System.out::println);
		
//		----------Sorting according to the salary------------
//		Sort asc =Sort.by("salary").descending();// the value which is given in the entity class should be wrutten here
//		System.out.println(asc);
//		allEmps = repo.findAll(asc);
//		allEmps.forEach(System.out::println);
		
	// sorting according to the names
		
//		allEmps=repo.findAll(Sort.by("name").ascending());
//		allEmps.forEach(System.out::println);
		
//		allEmps=repo.findAll(Sort.by("name").ascending().and(Sort.by("salary").descending()));
//		allEmps.forEach(System.out::println);
		
		
//		---------------Pagination-------------
		
//		int pageNo =5; // page no
//		int pageSize = 2;	// no of records
//		PageRequest page =PageRequest.of(pageNo-1, pageSize);
//		
//		
//		Page<Employee> pageEmp = repo.findAll(page);
//		pageEmp.forEach(System.out::println);
//		
		
		// ---------------------Query By Example----------------
		// fetch the data from the table whose location(department) is dolakpur.
		
//		Employee emp= new Employee(); // dummy object (matcher)
//		// emp.setDept("dolakpur");
//		emp.setSalary(30000);
//		Example<Employee> e = Example.of(emp); 
//		List<Employee> demp = repo.findAll(Example.of(emp));
//		demp.forEach(System.out::println);
		
		}
}
