package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nt.config.EmployeeConfig;
import com.nt.pojo.Employee;

public class App 
{
    public static void main( String[] args )
    {
      
    	ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
    	
    	//Employee emp=context.getBean("employee1",Employee.class);  //specify bean method name
    	//Employee emp=context.getBean("emp2",Employee.class); //specify bean name
    	
    	   Employee emp=context.getBean(Employee.class); //using @Primary annotation
    	  System.out.println("Employe name:"+emp.getName());
    	 System.out.println("Employee salary:"+emp.getSalary());
    }
}
