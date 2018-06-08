package com.cg.hellospringboot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan
public class HelloController {
	@RequestMapping("/")
	public String  namaskar()
	{ 
		
		return "namasker";}
	
	}

 
