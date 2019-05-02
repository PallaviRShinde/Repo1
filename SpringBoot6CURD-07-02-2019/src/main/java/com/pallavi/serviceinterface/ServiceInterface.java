package com.pallavi.serviceinterface;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.pallavi.model.Employee;

public interface ServiceInterface {
public void addEmployee(Employee e);
public String  getAllEmployee(ModelMap mp);
public Employee findAllByUserNameAndPassword(String userName,String password);
public void deleteEmployee(int empId);
public Employee getEmployeeById(int empId);
public String login(String userName,String password,ModelMap mp);
}
