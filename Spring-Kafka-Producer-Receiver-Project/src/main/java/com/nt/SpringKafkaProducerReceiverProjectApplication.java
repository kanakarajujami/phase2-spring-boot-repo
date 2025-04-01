package com.nt;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringKafkaProducerReceiverProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaProducerReceiverProjectApplication.class, args);
	}

}
