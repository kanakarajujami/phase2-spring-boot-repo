package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.service.Seller;

@Component
public class SalesService {
     @Autowired
    //@Qualifier("corparateSeller")
     @Qualifier("individualSeller") 
     
	 private Seller seller;
     
       public void modeSeller() {
    	   seller.addProduct("iPhonne");
    	   seller.removeProduct("iPhone");
    	   System.out.println("Total sales "+seller.calculateSales(30));
    	   
       }
}
