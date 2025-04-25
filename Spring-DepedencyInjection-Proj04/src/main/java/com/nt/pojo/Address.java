package com.nt.pojo;

import org.springframework.stereotype.Component;

@Component
public class Address {

	String city="bengulure";
	long  pincode=234564;
	
	public void getAddress() {
		System.out.println("employe city:"+city);
		System.out.println("employee pincode:"+pincode);
	}
	
	
}
