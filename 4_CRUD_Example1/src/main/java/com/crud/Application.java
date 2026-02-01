package com.crud;

import java.util.*;
import java.util.Arrays;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.crud.Entity.Employee;
import com.crud.Repository.EmpRepo;


@SpringBootApplication
public class Application {

	// crud repository and its methods
	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		
		EmpRepo repo= ctxt.getBean(EmpRepo.class);
		
		Employee e1=  new Employee();
		
		e1.setId(1);
		e1.setName("Hari");
		e1.setEmail("hari123@gmail.com");
		e1.setSalary(3400);
		e1.setPhone(1234567890);
		
		repo.save(e1);
		
		

		Employee e2=  new Employee();
		
		e2.setId(3);
		e2.setName("priya jain");
		e2.setEmail("priya23@gmail.com");
		e2.setSalary(8400);
		e2.setPhone(1238567899);
//		
//		save ()----upsert()
//		used to insert or update the table in the database for a single record
		
//		repo.save(e2);
//		System.out.println("Data Entered successfully");
		
		
		// -----saveAll()------
		// used to insert or update multiple records
		
		Employee e3 = new Employee(3,"divya",987543213,"divya@gmail.com",8976);
		Employee e4 = new Employee(4,"ramya",897543213,"ramya@gmail.com",89901);
		Employee e5 = new Employee(5,"kavya",987548713,"kavya@gmail.com",9976);
		Employee e6 = new Employee(3,"chandu",909543213,"chandhu @gmail.com",89076);
		
//		
//		List<Employee> mEmp = new ArrayList<>();
//		mEmp.add(e3);
//		mEmp.add(e4);
//		mEmp.add(e5);
//		mEmp.add(e6);
//		repo.saveAll(mEmp);
		
		
		
		
		
		
//		repo.saveAll(Arrays.asList(e3,e4,e5,e6));
		
		
		// System.out.println("saved multiple employees");
		
		//------------------findById()-------------------
		// fetch the record based on the primary key(ID)
//		int id=3;
//		Optional<Employee> emp = repo.findById(id);
//		
//		if(emp.isPresent()) { // isPresent is present in the optional class
//			System.out.println(emp.get());
//		}
//		else {
//			System.out.println("Employee with "+ id +" is not available");
//		}
		
		
		// ------findAllById()--------------
		// fetch multiple records by a list of ids
		
//		Iterable<Employee> mEmpById = repo.findAllById(Arrays.asList(1,2,3));
//		
//		for(Employee emp : mEmpById) {
//			System.out.println(emp);
//		}
//		
//		System.out.println("Retrieved multiple employees");
		
		
		// ---------------findAll()---------------
		// fetch all the records from the table
		
//		Iterable<Employee>  allEmp = repo.findAll();
//		for(Employee emp : allEmp) {
//			System.out.println(emp);
//		}

		
		// ---------------existsById()----------------
		// It check whether the data is present in the database or not with id
		
//		boolean isPresent = repo.existsById(10);
//		if(isPresent) {
//			System.out.println("Data is available");
//		}
//	
//		else {
//			System.out.println("Data is not available");
//		}
		
		
		// --------------count()----------
		// return the no of entities or records present 
//		System.out.println(repo.count());
		
		
		// ------------deleteById()--------------------
		 // deletes the record based on id
		
//		int i=9;
//		if(repo.existsById(i)) {
//			repo.deleteById(i);
//			System.out.println("Record deleted");
//		}
//		else {
//			System.out.println("no employee found with such id: "+ i);
//		}
		
		
		//----------------delete()-----------------
		// delete the particular entity object
		
		
//		repo.delete(e5);
//		System.out.println("Deleted one employee using entity");

		
		// ----------------deleteAllById()-------------------
		// multiple records will be deleted based on multiple ids
		
//		repo.deleteAllById(Arrays.asList(3,4));
//		System.out.println("Deleted");
		
		
		// ------------------deleteAll() with entities --------------
		// multiple record will be deleted based on the multiple entities
//		repo.deleteAll(Arrays.asList(e1,e2,e3));
		
		// ----------------deleteAll()-------------
		// it will delete all the records from the table
		
//		repo.deleteAll();
//		System.out.println("All the records has been deleted");
	}

}
