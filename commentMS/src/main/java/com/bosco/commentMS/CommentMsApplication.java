package com.bosco.commentMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CommentMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommentMsApplication.class, args);
	}

}
