package com.hjnf.exam.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hjnf.exam.domain.vo.User;

@RestController
@RequestMapping("/lombok")
public class LombokTestController {
	

	@GetMapping("/test")
	public ResponseEntity<Map<String, Object>> test( ) {
		
		 
		User user = new User();
		user.setName("the-dev");
		user.setAge(20); 
		
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, Object> node = new HashMap<String, Object>();
		
		node.put("User", user);
		result.put("Result", user);
		
		return ResponseEntity.ok(result);
	}
}
