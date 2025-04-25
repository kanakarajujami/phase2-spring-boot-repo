package com.nt.service;

import org.springframework.context.annotation.Primary;

import org.springframework.stereotype.Component;

@Component
@Primary
public class WholesaleSeller implements Seller {
   
	@Override
	public void addProduct(String product) {
	    
		     System.out.println("Wholesale Seller added product:"+product);
	}

	@Override
	public void removeProduct(String product) {
	
		System.out.println("Wholesale Seller removed product:"+product);
		
	}

	@Override
	public double calculateSales(int unitsSold) {
	
		return unitsSold*30;
	}

}
