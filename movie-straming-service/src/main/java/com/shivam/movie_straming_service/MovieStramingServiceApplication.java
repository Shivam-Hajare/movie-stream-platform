package com.shivam.movie_straming_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieStramingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieStramingServiceApplication.class, args);
	}

}
