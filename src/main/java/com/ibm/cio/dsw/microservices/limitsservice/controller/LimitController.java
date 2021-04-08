package com.ibm.cio.dsw.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.cio.dsw.microservices.limitsservice.bean.Limits;
import com.ibm.cio.dsw.microservices.limitsservice.configuration.Configuration;

@RestController
public class LimitController {
	
	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		
		return new Limits(config.getMin(), config.getMax());
		//return new Limits(1,1000);
		
	}

}
