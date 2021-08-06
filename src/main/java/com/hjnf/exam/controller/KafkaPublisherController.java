package com.hjnf.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hjnf.exam.kafka.Producer;

@RestController
@RequestMapping( value = "kafka" )
public class KafkaPublisherController {

	@Autowired
	private Producer producer;
	
	@PostMapping(value = "publish") 
	public String sendMessage(@RequestParam String message ) throws Exception {
		
		producer.sendMessage(message);
		
		return "Success";
	}
}

// curl -X POST -F 'message=test' http://localhost:8080/kafka/publish