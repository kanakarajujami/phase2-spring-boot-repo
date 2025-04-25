package com.nt.ruuner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class MyRunner2 implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		   System.out.println("=====ApplicationRunner arguments=======");
		System.out.println(args.getOptionNames());
		System.out.println(args.getOptionValues("dbname"));
		System.out.println(args.getOptionValues("dbuser"));
		System.out.println(args.getNonOptionArgs());
	

}
}
