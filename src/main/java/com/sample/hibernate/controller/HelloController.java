package com.sample.hibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/sample")
public class HelloController {

	@RequestMapping("/hello")
	public String helloController(HttpServletRequest req){
		return "hello";
	}
}
