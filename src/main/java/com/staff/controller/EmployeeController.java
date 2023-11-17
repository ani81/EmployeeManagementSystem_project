package com.staff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.staff.employee.Employee;
import com.staff.service.EmployeeService;

@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeService s;
	
	
	@GetMapping("/getall")
	public List<Employee> getAllData() {
	List<Employee> list =s.getAllData();
	return list;
	}
       
      
      @PostMapping("/add")
      public String addnewdata(@pathvariable string){
      return addnewdata.
        
}


	
	
}
