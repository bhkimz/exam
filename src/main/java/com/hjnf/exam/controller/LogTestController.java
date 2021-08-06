package com.hjnf.exam.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogTestController {
	public static final Logger logger = LoggerFactory.getLogger(LogTestController.class); 
	
	@GetMapping("/test")
	public ResponseEntity<String> test() {
		
		logger.debug("this is #### debug message ");
		logger.info("this is @@@@ info message ");
		
		
		return ResponseEntity.ok("Success");
	}
}
