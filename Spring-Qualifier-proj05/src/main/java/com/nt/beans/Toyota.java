package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("toyota")
public class Toyota implements Car {
	/*
	 * @Autowired Person per;  get UnsatisfiedDependencyException
	 */

	@Override
	public void price() {

		
		System.out.println("Toyota car start price  on 13.5 lakhs ");

	}

}
