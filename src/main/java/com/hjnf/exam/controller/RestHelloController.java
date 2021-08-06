package com.hjnf.exam.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class RestHelloController {
	public static final Logger logger = LoggerFactory.getLogger(RestHelloController.class); 
	

	@GetMapping("/apihello")
	public ResponseEntity<Map<String, Object>> hello( ) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, Object> node = new HashMap<String, Object>();
		
		node.put("Message", "apiHello");
		result.put("Result", node);
		
		
		
		
		
		return ResponseEntity.ok(result);
	}
}
