package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.GrilProperties;


@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	@Autowired
	private GrilProperties girlProperties;
//	@RequestMapping(value = {"/name"})
//	@GetMapping("/name")
	@PostMapping("/name")
	public String index(@RequestParam(value = "id", required = false, defaultValue = "0") String id) {
		
		return girlProperties.getGirlname() + " id " + id;
	}
}
