package com.example.kafka.springbootdemokafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.kafka.springbootdemokafkaconsumer.model.Employee;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics = "connect-test", groupId = "group_id")  // topic created in the quickstart kafka site
	// note groupId will help us to identify other topic in the same listener
	public void consume(String message) {
		System.out.println(
				"Consume message " + message
				);
	}

	@KafkaListener(topics = "Kafka_Example_Json", groupId = "group_json", containerFactory = "employeeKafkaListenerContainerFactory")  // topic has to be created
	// note groupId will help us to identify other topic in the same listener
	public void consumeJson(Employee message) {
		System.out.println(
				"Consume JSON message " + message
				);
	}

}
