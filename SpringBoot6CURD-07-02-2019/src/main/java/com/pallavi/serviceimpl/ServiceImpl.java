package com.pallavi.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.pallavi.model.Employee;
import com.pallavi.repository.EmployeeRepository;
import com.pallavi.serviceinterface.ServiceInterface;
@Service
public class ServiceImpl implements ServiceInterface {
@Autowired
EmployeeRepository di;
	@Override
	public void addEmployee(Employee e) {
		
		di.save(e);		
	}

	@Override
	public String getAllEmployee(ModelMap mp) {
		List<Employee> lst =(List<Employee>) di.findAll();
		mp.addAttribute("data", lst);
		return "success" ;
	}

	@Override
	public Employee findAllByUserNameAndPassword(String userName, String password) {
	
		return di.findAllByUserNameAndPassword(userName, password);
	}
@Override
public void deleteEmployee(int empId)
{
	di.delete(empId);

}

@Override
public Employee getEmployeeById(int empId) {
	
	return di.findByEmpId(empId);
}

@Override
public String login(String userName, String password,ModelMap mp) {
	List<Employee>empLst=new ArrayList<Employee>();
	if(userName.equals("admin")&& password.equals("admin"))
	{
	return getAllEmployee(mp);
	}
	else
	{
		Employee e=findAllByUserNameAndPassword(userName, password);
		if(e==null)
		{
			mp.addAttribute("errMsg", "invalid UserName/ Password");
			return "login";
		}
		else
		{
		empLst.add(e);
		mp.addAttribute("data", e);
		mp.addAttribute("data", empLst);
		return "success";
		}
		
	}
}


	

}
