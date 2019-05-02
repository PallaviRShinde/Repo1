package com.pallavi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pallavi.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	public Employee findAllByUserNameAndPassword(String userName , String password);
	public Employee findByEmpId(int empId);
}
