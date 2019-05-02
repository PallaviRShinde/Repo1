package com.pallavi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pallavi.model.Employee;
import com.pallavi.serviceinterface.ServiceInterface;


@Controller
public class CommonController {
	@Autowired
	ServiceInterface si;
	
@RequestMapping("/")
	public String startHere()
	{
		return "login";
	}

@RequestMapping("/log")
public String login(@RequestParam String userName,@RequestParam String password, ModelMap mp)
{	
return si.login(userName, password,mp);	
}

@RequestMapping("jsp/regi")
public String registration(@ModelAttribute Employee e, ModelMap mp)
{
	
	si.addEmployee(e);
	return si.getAllEmployee(mp);
}
@RequestMapping("delete")
public String deleteEmployee(@RequestParam ("empId") int empId, ModelMap mp)
{
	si.deleteEmployee(empId);
	return si.getAllEmployee(mp);
}

@RequestMapping("edit")
public String editEmployee(@RequestParam ("empId") int empId, ModelMap mp)
{
     Employee d=si.getEmployeeById(empId);
	 mp.addAttribute("d", d);
	return "edit";
}

@RequestMapping("upd")
public String updateEmployee(@ModelAttribute Employee d,ModelMap mp)
{
List<Employee> empLst= new ArrayList<Employee>();
si.addEmployee(d);
d=si.getEmployeeById(d.getEmpId());
empLst.add(d);
	mp.addAttribute("data", empLst);
	return "success";
}

}
