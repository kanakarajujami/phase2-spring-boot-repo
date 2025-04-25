package com.nt.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {


	private String name="ram";
private	 String desg="java developer";
	 
	//@Autowired  //field injunction
	
public Address address;
	
	//construction injunction

/*	public Employee(Address address) {
	          this.address = address; 
		  }*/
	

	 
@Autowired //setter level injunction
	public void setAddress(Address address) {
		this.address = address;
	}



	public void getEmploye() {
		 System.out.println("employe name:"+name);
		 System.out.println("employe designation:"+desg);
		 address.getAddress();
		 
	 }
	 
	 
}
