package com.nt;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.EmployeConfig;
import com.nt.pojo.Employee;

public class App 
{
    public static void main( String[] args )
    {
      
    	ApplicationContext context=new AnnotationConfigApplicationContext(EmployeConfig.class);
    	
    	//get employee from container 
    	Employee emp=context.getBean(Employee.class);
    	
    	emp.getEmploye();
    }
}
