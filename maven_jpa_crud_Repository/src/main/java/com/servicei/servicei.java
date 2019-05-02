package com.servicei;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Student;
public interface servicei {

	public void register(Student student);
	
	public Student login(String username,String password);
	
	public List<Student> alldata();
	
	public Student getdata(int id);
	public void delet(Student stu);
	
	
}
