package com.nt.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;


public class MessageQueSender  implements CommandLineRunner{

	 @Autowired
	 private JmsTemplate template;
	@Override
	public void run(String... args) throws Exception {
		
		template.send("temp4", ses->ses.createTextMessage("From the sender:"+new Date()));
		
	}

}
