package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nt.config.BookTravelConfig;
import com.nt.controller.BookMyTravel;

public class App {
    public static void main(String[] args) {
      
    	ApplicationContext context=new AnnotationConfigApplicationContext(BookTravelConfig.class);
    	
    	BookMyTravel travel=context.getBean(BookMyTravel.class);
    	travel.bookTravel();
    }
}
