package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.StudentConfig;
import com.nt.pojo.Student;

public class App {
    public static void main(String[] args) {
    
    	ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
    	
    	//print student data
    	Student stu=context.getBean(Student.class);
    	stu.getStudent();
    
    }
}
