package com.nt.runner;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.nt.model.Actor;

@Component
public class MessageQueReceiver{

		
	@JmsListener(destination = "topic6")
		public void readMessage(Actor actor) {
			System.out.println(actor);
		}

}
