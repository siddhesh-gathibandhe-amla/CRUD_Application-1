package com.crudapplication.mainpackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapplication.mainpackage.entity.Employee;
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
