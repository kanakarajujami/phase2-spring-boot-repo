package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.producer.MessageProducer;
import com.nt.store.MessageStore;

@RestController
@RequestMapping("/restapi")
public class MessageController {

	 @Autowired
	private MessageProducer producer;
	 
	 @Autowired
	 private MessageStore store;
	 
	 @GetMapping("/send")
	 public String sendMessage(@RequestParam("message") String message) {
		 
		String status= producer.sendMessage(message);
		 return "<h1>"+status+"</h2>";
	 }
	 
	 @GetMapping("/readAll")
	 public String getAllMessages() {
		 
	  return store.readMessages();
	 }
}
