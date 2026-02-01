 package com.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
