package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.pojo.Car;

public class App {
    public static void main(String[] args) {
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	
    	
    	   Car car=context.getBean(Car.class);
    	   System.out.println("car name:"+car.getName());
    	   System.out.println("car model name:"+car.getModel());
    	   
           }
}
