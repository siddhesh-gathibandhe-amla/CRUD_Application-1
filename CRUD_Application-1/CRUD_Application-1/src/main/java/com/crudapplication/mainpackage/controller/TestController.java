package com.crudapplication.mainpackage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.crudapplication.mainpackage.entity.Employee;
import com.crudapplication.mainpackage.repository.EmployeeRepository;

@RestController
public class TestController {
	@Autowired
	EmployeeRepository empRepo;

	@GetMapping("/")
	public String GetHomePage() {
		return "This is home page";
	}

	@GetMapping("/addEmployee")
	public String AddEmployee() {
		Employee emp = new Employee();
		emp.setEmployeeName("Siddhesh Gathibandhe");
		emp.setEmail("siddhesh@yopmail.com");
		emp.setEmployeeNumber("9096534668");
		empRepo.save(emp);
		return "Employee Added";
	}

	@GetMapping("/getemployee/{id}")
	public Employee GetEmployeeById(@PathVariable int id) {
		return empRepo.findById(id) == null ? new Employee() : empRepo.findById(id).get();
	}

	@GetMapping("/getallemployee")
	public List<Employee> getAllEmployee() {
		return empRepo.findAll();
	}

	@GetMapping("/deleteemployeebyid/{userid}")
	public String DeleteEmployeeById(@PathVariable int userid) {
		try {
			empRepo.deleteById(userid);
			return "Record deleted successfully.";
		} catch (Exception e) {
			return "Employee Id is not available.";
		}
	}

	@GetMapping("/copyname/{something}")
	public String CopyName(@PathVariable String something) {
		try {
			return something;
		} catch (Exception e) {
			return "Employee Id is not available.";
		}
	}
}
