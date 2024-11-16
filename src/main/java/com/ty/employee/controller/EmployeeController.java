package com.ty.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.employee.entity.Employee;
import com.ty.employee.repository.EmployeeRepository;
@CrossOrigin("*")
@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepository repo;
	@GetMapping("/emp")
	public List<Employee> getdata(){
		
		
		List<Employee> emp=repo.findAll();
		return emp;
		
	}

}
