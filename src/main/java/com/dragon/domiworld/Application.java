package com.dragon.domiworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.dragon.domiworld.Application;

@SpringBootApplication
public class Application extends SpringBootServletInitializer{

	// 톰캣을 돌리기 위한 초기 설정
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	   return builder.sources(Application.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
