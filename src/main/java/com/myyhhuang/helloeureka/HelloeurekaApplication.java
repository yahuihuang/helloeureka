package com.myyhhuang.helloeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HelloeurekaApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HelloeurekaApplication.class, args);
		new SpringApplicationBuilder(HelloeurekaApplication.class).web(WebApplicationType.SERVLET).run(args);
	}

}
