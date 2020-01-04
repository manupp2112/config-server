package com.mphasis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/rest")
@RestController
public class DemoController {
	@Value("${message:Defauult Hello...}")
	private String message;
	@GetMapping("/msg")
public String message() {
	
	return message;
}
}
