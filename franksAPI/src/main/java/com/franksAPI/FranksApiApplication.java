package com.franksAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FranksApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FranksApiApplication.class, args);
	}
	
	@Bean
	public RestTemplate rTemplate(){
		return new RestTemplate();
	}

}
