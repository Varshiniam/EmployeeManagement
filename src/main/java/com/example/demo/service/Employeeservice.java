package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.Employeerepo;

@Service
public class Employeeservice {
	
	@Autowired
	private Employeerepo emprepo;
	
	public Employee registerEmployee(Employee employee) {
		Employee employee1=emprepo.save(employee);
		return employee1;
	}
	
	public List<Employee> getAllEmployee(){
		List<Employee> allEmployee=emprepo.findAll();
		return allEmployee;
		
	}
	
	public Employee getByEmployeeId(long id) {
		Employee employee = emprepo.getById(id);
		return employee;
		
	}
	
	public String deleteEmployeeById(long id) {
		try {
			emprepo.deleteById(id);
			return "Employee is deleted";
		}
		catch(Exception e) {
			return "Employee is not deleted successfully";
		}
	}
	
	public Employee updateEmployeeById(Employee employee) {
		Employee employee1 = emprepo.getById(employee.getId());
		employee1.setFirstName(employee.getFirstName());
		employee1.setEmailId(employee.getEmailId());
		employee1.setLastName(employee.getLastName());
		Employee employee2=emprepo.save(employee1);
		return employee2;
		
	}

}
