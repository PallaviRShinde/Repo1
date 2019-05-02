package com.daoi;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Student;

public interface Daoi extends CrudRepository<Student, Integer>{

	
	
	public Student findAllByUsernameAndPassword(String username,String password);
	
	public Student findAllById(int id);
	
}
