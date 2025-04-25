package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.Engine;

@Component
public class EngineRunner  implements CommandLineRunner{

	@Autowired
	private Engine engine;
	@Override
	public void run(String... args) throws Exception {
		
		engine.start();
		engine.stop();
		
	}

}
