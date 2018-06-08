package com.cg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	public Message namaskar()
	{ 
		System.out.println("hello");
		//return "namasker";}
	Message m = new Message("Namaskar");
	return m;
	}
} 
 
