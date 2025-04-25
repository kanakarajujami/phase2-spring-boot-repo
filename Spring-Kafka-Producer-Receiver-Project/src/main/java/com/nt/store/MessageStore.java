package com.nt.store;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MessageStore {

	 List< String> list=new ArrayList<String>();
	 
	 public void addMessage(String msg) {
		 
		 list.add(msg);
	 }
	 
	 public String  readMessages() {
		 
		 return list.toString();
	 }
}
