package com.bosco.quotesMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class QuotesMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuotesMsApplication.class, args);
	}

}
