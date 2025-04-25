package com.nt.service;

import org.springframework.stereotype.Component;

@Component
public class CorparateSeller implements Seller {

	@Override
	public void addProduct(String product) {

		  System.out.println("Corparate Seller added product:"+product);

	}

	@Override
	public void removeProduct(String product) {

		  System.out.println("Corparate Seller removed product:"+product);
	}

	@Override
	public double calculateSales(int unitsSold) {
	
		return unitsSold*10.0;
	}

}
