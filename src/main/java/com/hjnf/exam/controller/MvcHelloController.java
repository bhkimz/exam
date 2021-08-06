package com.hjnf.exam.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("v1")
public class MvcHelloController {

	@GetMapping("/web")
	public String web(HttpServletRequest request, HttpServletResponse response, Map<String, Object> model) {
		
		model.put("message", "Welcome");
		
		return "hello";
	}
}
