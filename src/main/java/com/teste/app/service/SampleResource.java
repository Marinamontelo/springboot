package com.teste.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleResource {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleResource.class);
	
    @RequestMapping("/marina")
    public void hello(Object object) {
    	try {
    		logger.error("I'M PICKE RICK AAAAAAAAAA");
    		logger.error("I'M PICKE RICK AAAAAAAAAA");
    		logger.error("I'M PICKE RICK AAAAAAAAAA");
    		logger.error("I'M PICKE RICK AAAAAAAAAA");
    		logger.error("I'M PICKE RICK AAAAAAAAAA");
    		logger.error("I'M PICKE RICK AAAAAAAAAA");
		} catch (Exception e) {
			e.getMessage();
		} 
    }

}
