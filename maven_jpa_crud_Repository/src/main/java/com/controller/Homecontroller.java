package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.model.Student;
import com.servicei.servicei;

@Controller
public class Homecontroller {

	@Autowired
	servicei ser;
	
	List<Student>	list;
	@RequestMapping("/")
	public String start()
	{
		System.out.println("hello");
		return "index";
	}
	@RequestMapping("/regi")
	public String registerpage(@RequestParam (value="add")String add,Model model)
	{
		/*System.out.println(add);
		if(add=="Add_New")
		{
			
		model.addAttribute("key", add);	
		}
		*/
		return "register";
	}

	@RequestMapping("/log")
	public String login(@ModelAttribute Student student,Model model)
	{
		System.out.println("hello");
		
		String username=student.getUsername();
		String password=student.getPassword();
		
		
		System.out.println(username+ " "+password);
		Student stu=ser.login(username,password);
		String uname=stu.getUsername();
		String pass=stu.getPassword();
		System.out.println("nmnm");
		if(uname!=null&&pass!=null)
		{
			
			System.out.println("not null");
		list=ser.alldata();	
		model.addAttribute("data", list);
		System.out.println("list"+list);
			
		}
		return "success";
	}
	@RequestMapping("/register")
	public String register1(@ModelAttribute Student student,Model model)
	{System.out.println("in reg");
	/*String add=student.getAdd();
	System.out.println(student.getAdd());
	if(add=="Add_New")
	{
		System.out.println(add);
		System.out.println(student.getAdd());
		ser.register(student);
		list=ser.alldata();
		model.addAttribute("data", list);
		return "sucess";
	}
	*/
		ser.register(student);
		return "index";
	}
	@RequestMapping("/deleted")
	public String delet(@ModelAttribute Student student,Model model)
	{
		Student stu=ser.getdata(student.getId());
		ser.delet(stu);
		
		
		
		list=ser.alldata();
		model.addAttribute("data", list);
		return "success";
	}
	@RequestMapping("/edited")
	public String edit(@ModelAttribute Student student,Model model)
	{
		
		Student stu=ser.getdata(student.getId());
		model.addAttribute("data", stu);
		
		return "edit";
	}
	@RequestMapping("/update")
	public String update(@ModelAttribute Student stu,Model model)
	{
		
		ser.register(stu);
	list=	ser.alldata();
	model.addAttribute("data",list);
		return "success";
	}
	
	
	
}
