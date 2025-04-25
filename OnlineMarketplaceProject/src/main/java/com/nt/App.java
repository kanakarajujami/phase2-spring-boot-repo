package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.SellerConfig;
import com.nt.controller.SalesService;

public class App {
    public static void main(String[] args) {
     
    	ApplicationContext context=new AnnotationConfigApplicationContext(SellerConfig.class);
    	
    	SalesService sales=context.getBean(SalesService.class);
        sales.modeSeller();
    }
}
