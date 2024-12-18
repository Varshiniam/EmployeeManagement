package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public interface Employeerepo extends JpaRepository<Employee,Long>{
	
	Employee save(Employee employee);

}
