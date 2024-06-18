package com.sandesh.springbootsecurity;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
}