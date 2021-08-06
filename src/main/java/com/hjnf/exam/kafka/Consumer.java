package com.hjnf.exam.kafka;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer { 
	private static final Logger logger = LoggerFactory.getLogger(Consumer.class);
	
	@KafkaListener(topics = "test", groupId = "myGroup")
	public void consumer(String message) throws IOException { 
		logger.info("Listener message :: " + message); 
	}
}
