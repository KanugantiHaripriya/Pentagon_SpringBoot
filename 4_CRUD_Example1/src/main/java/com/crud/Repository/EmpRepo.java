package com.crud.Repository;

import org.springframework.data.repository.CrudRepository;

import com.crud.Entity.Employee;

public interface EmpRepo extends CrudRepository<Employee, Integer>{
	
}
