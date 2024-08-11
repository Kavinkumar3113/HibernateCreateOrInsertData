package com.CreateOrInsert;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private String dept;
	private String designation;
	private String dateofjoin;
	private double salary;
	public Employee() {
		
	}
	public Employee(int id, String name, String dept, String designation, String dateofjoin, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.designation = designation;
		this.dateofjoin = dateofjoin;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public String getDesignation() {
		return designation;
	}
	public String getDateofjoing() {
		return dateofjoin;
	}
	public double getSalary() {
		return salary;
	}
	
	
	

}
