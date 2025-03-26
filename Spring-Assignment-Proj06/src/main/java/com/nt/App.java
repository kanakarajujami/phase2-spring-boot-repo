package com.nt;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.VehicleConfiguration;
import com.nt.serivce.Person;
import com.nt.serivce.Vehicle;

public class App 
{
    public static void  main( String[] args )
    {
     
    	 ApplicationContext context=new AnnotationConfigApplicationContext(VehicleConfiguration.class);
    	 
    	    Person person= context.getBean(Person.class);
    	    
    	    person.trip();
    }
}
