package com.hjnf.exam.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Component
public class Producer { 
	private static final Logger logger = LoggerFactory.getLogger(Producer.class);
	private static final String TOPIC = "test";
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMessage(String message) {
		ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(TOPIC, message);
        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onSuccess(SendResult<String, String> result) { 
            	logger.info("Sent message " );
            }

            @Override
            public void onFailure(Throwable ex) {
            	logger.info("Unable to send message " ); 
            }
        });
	}
}

