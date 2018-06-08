package com.teste.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class StaticWebApplication extends SpringBootServletInitializer {

	private static final Logger logger = LoggerFactory.getLogger(StaticWebApplication.class);	
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(StaticWebApplication.class, args);
        logger.debug("--Application Started--");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(getClass());
    }

}
