package com.nt.bindings;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	

   @Value("${student.info.id}")
	int id;
   @Value("${student.info.name}")
	String name;
   @Value("${student.info.branch}")
	String branch;
   @Value("${student.info.phoneNo}")
	Long phoneNo;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
}
