package com.meditrusthealth.fast.eureka.client.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FastEurekaClientConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastEurekaClientConsumerApplication.class, args);
	}
}
