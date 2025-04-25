package com.nt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.config.VehicleConfiguration;
import com.nt.service.Person;
import com.nt.service.Song;

public class App 
{
    public static void  main( String[] args )
    {
     
    	 ApplicationContext context=new AnnotationConfigApplicationContext(VehicleConfiguration.class);
    	 
    	    Person person= context.getBean(Person.class);
    	    
    	    person.trip();
			/*
			 * Song song =new Song(); song.setTitle("Are You Entertained");
			 * song.setSinger("Ed sheeran");
			 * 
			 * String result= person.vehicle.playMusic(true, song);
			 * System.out.println(result);
			 */
    }
    
  
}
