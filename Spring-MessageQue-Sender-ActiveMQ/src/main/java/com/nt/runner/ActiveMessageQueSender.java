package com.nt.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.nt.model.Actor;

@Component
public class ActiveMessageQueSender {

	 @Autowired
     JmsTemplate template;
	@Scheduled(cron="*/10 * * * * * ")
	public void sendMessage() {
		/*
		 * template.send("temp5", ses->ses.createTextMessage("From the sender:"+new
		 * Date()));
		 * 
		 * System.out.println("Message sent:");
		 */
		
		Actor actor=new Actor("prabhas","hyd","Venky");
		template.convertAndSend("topic6", actor);
		System.out.println("Send object as message...");
	}
	
	
}
