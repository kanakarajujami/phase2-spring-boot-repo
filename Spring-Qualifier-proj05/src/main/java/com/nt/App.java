package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nt.beans.Person;
import com.nt.config.PersonConfig;

public class App {
    public static void main(String[] args) {
      ApplicationContext context=new AnnotationConfigApplicationContext(PersonConfig.class);
     
      Person per=context.getBean(Person.class);
      per.getPerson();
      
      
    }
}
