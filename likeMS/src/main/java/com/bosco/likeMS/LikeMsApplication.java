package com.bosco.likeMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LikeMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LikeMsApplication.class, args);
	}

}
