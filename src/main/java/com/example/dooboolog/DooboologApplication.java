package com.example.dooboolog;

import com.github.jknack.handlebars.springmvc.HandlebarsViewResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan
@EnableJpaRepositories
@EnableAutoConfiguration
@SpringBootApplication
public class DooboologApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DooboologApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DooboologApplication.class, args);
	}

	@Bean
	public HandlebarsViewResolver handlebarsViewResolver() {
		HandlebarsViewResolver viewResolver = new HandlebarsViewResolver();
		viewResolver.setOrder(1);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".hbs");
		return viewResolver;
	}
}
