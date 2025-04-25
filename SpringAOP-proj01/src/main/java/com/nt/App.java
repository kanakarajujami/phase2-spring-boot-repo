package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.ServiceConfig;
import com.nt.service.SampleService;

public class App {
    public static void main(String[] args) {
       ApplicationContext context=new AnnotationConfigApplicationContext(ServiceConfig.class);
     
     SampleService service=context.getBean(SampleService.class);
     service.someMethod();
    }
}
