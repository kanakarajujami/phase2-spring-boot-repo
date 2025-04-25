package com.nt.pojo;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
public class Student {

	  String name;
	  long rollNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	
	@PostConstruct
	public void initialize() {
		
		System.out.println("postconstruct executed");
		this.name="Hari";
		this.rollNo=5463798l;
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("PreDestroy executed");
	}
	  
public void getStudent() {
	System.out.println("student name:"+name);
	System.out.println("student roll no:"+rollNo);
}

}
