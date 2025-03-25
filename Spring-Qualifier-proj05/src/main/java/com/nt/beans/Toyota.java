package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("toyota")
public class Toyota implements Car {

	@Override
	public void price() {
		
		System.out.println("Toyota car start price  on 13.5 lakhs ");

	}

}
