package com.nt.ruuner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(50)
public class MyRuuner1 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("=========Commnadline Arguments========www");
		for(String arg : args) {
			
			System.out.println(arg);
			System.out.println(arg);
			
		}
		
	}

}
