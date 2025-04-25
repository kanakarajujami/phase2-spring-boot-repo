package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

@Component
public class Person {

	 private String name="mahesh";
	
	Car car;
	@Autowired
	public Person(@Qualifier("toyota") Car car) {
		this.car=car;
	}
	
	public void getPerson() {
		System.out.println("person name:"+name);
		car.price();
	}
}
