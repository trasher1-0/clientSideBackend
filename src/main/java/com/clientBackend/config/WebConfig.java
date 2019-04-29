package com.clientBackend.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {"com.clientBackend.spring.controller"})

// webMvcConfigurerAdupter is a predefine class that configure the project as a web project

public class WebConfig extends WebMvcConfigurerAdapter{

	
}
