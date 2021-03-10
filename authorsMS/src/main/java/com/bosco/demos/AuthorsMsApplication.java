package com.bosco.demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AuthorsMsApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(AuthorsMsApplication.class, args);
	}
	

}
