package com.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tedu.client.EurekaServiceFeign;

@RestController
public class HelloController {
	@Autowired
	private EurekaServiceFeign eurekaServiceFeign;

	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name){
		return this.eurekaServiceFeign.hello(name);
	}
}
