package com.example.dooboolog.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Slf4j
public class DooboologWebApplicationInitializer implements WebApplicationInitializer{
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		log.info("------------------------------------");
	}
}
