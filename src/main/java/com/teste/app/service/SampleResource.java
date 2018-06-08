package com.teste.app.service;

import org.apache.log4j.Logger;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleResource {
	
	private static Logger logger = Logger.getLogger(SampleResource.class);
	private static final Logger log = LoggerFactory.getLogger(Foo.class);

    @RequestMapping("/teste")
    public String hello() {
    	logger.error("aAdada");
        return "Hello World!";
    }

}
