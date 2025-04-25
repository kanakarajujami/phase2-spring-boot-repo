package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.ELearningConfig;
import com.nt.controller.ELearningPlatform;

public class App 
{
	
    public static void main( String[] args )
    {
      
    	  ApplicationContext context=new AnnotationConfigApplicationContext(ELearningConfig.class);
    	  
    	  ELearningPlatform platform=context.getBean(ELearningPlatform.class);
    	  platform.learningPlatform();
    }
}
