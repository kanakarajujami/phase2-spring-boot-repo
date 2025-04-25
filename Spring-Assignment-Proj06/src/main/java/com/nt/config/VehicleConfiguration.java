package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.nt.service.Song;
@Configuration
@ComponentScan("com.nt")
@EnableAspectJAutoProxy
public class VehicleConfiguration {

	  @Bean
	    public Song getSong() {
	    	Song song=new Song("SPBALu","Sri Ram");
	    	return song;
	    }
}
