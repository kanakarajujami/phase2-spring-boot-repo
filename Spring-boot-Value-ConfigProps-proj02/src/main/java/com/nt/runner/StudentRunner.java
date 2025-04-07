package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.bindings.Employee;
import com.nt.bindings.Student;

@Component
public class StudentRunner implements CommandLineRunner {

	 @Autowired
	 Student student;
	 @Autowired
	 Employee employee;
	@Override
	public void run(String... args) throws Exception {
	
		System.out.println("=======Student information==========");
		System.out.println(student.toString());
		
		System.out.println("=======employee information===========");
		System.out.println(employee.toString());

	}

}
