package com.madpoints.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madpoints.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();
}
