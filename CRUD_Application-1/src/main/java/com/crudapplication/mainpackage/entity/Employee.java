package com.crudapplication.mainpackage.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;


@JsonIgnoreProperties("hibernateLazyInitializer")
@Table(name = "EmployeeTable")
@Entity
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "EmployeeId")
	private int EmployeeId;
	
	@Column(name = "EmployeeName")
	private String EmployeeName;
	

	@Column(name = "Email")
	private String Email;
	
	@Column(name = "EmployeeNumber")
	private String EmployeeNumber;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, String email, String employeeNumber) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		Email = email;
		EmployeeNumber = employeeNumber;
	}

	public Integer getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getEmployeeNumber() {
		return EmployeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		EmployeeNumber = employeeNumber;
	}

	
	
}
