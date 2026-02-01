package com.crud.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="empTable") // to change the table name
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	
	@Id // primary key (column name)
	private int id;
	
	@Column(name="empName") // to change the column name
	private String name; // column name
	
	@Column(name="empPhone")
	private long phone; // column name
	
	@Column(name="empEmail")
	private String email; // column name
	
	@Column(name="empSalary")
	private int salary; // column name

}
