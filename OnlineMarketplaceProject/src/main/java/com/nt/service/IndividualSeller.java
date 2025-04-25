package com.nt.service;

import org.springframework.stereotype.Component;

@Component
public class IndividualSeller implements Seller {

	@Override
	public void addProduct(String product) {
	     System.out.println("Invidual seller added product:"+product);
	}

	@Override
	public void removeProduct(String product) {
		   System.out.println("Individual seller removed product:"+product);
		}

	@Override
	public double calculateSales(int unitsSold) {
	
		  return unitsSold*20.0;

	}

}
