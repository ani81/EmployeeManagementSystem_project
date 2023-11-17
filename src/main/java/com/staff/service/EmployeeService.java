package com.staff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staff.dao.EmployeeDao;
import com.staff.employee.Employee;



@Service
public class EmployeeService {
	
	
	
	@Autowired
	EmployeeDao d;

	public List<Employee> getAllData() {
		  List<Employee>list = d.getAllData();
		return list;
	}

}
