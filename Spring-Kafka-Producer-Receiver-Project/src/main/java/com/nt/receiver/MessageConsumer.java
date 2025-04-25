
package com.nt.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.nt.store.MessageStore;

@Component
public class MessageConsumer {

	 @Autowired
	 private MessageStore store;
	@KafkaListener(topics = "${app.topic.name}",groupId = "grp1")
	public void readMsg(String msg) {
		
		store.addMessage(msg);
	}
}
