package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoi.Daoi;
import com.model.Student;
import com.servicei.servicei;
@Service
public class Serviceimpl implements servicei{

@Autowired
Daoi d;
	public void register(Student student){
		d.save(student);
	
		
	}
	

	public List<Student> alldata()
	{
		System.out.println("alldata");
		return (List<Student>) d.findAll();
		
	}
	public Student login(String username,String password)
	{
		System.out.println("klkl");
	return 	d.findAllByUsernameAndPassword( username,password);
}


	public Student getdata(int id)
	{
		
		
		return d.findAllById(id);
		
	}
	public void delet(Student stu)
	{
			d.delete(stu);
	
		
	}
}
	
