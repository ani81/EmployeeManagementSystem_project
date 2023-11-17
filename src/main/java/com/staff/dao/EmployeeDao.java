package com.staff.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.staff.employee.Employee;

@Repository

public void do my ();

public class EmployeeDao {
	
	@Autowired 
	SessionFactory sf;

	public List<Employee> getAllData() {
		
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employee.class);
		
		return cr.list();
	}

}
