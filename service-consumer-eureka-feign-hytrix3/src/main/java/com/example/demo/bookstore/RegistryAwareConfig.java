package com.example.demo.bookstore;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RegistryAwareConfig {
	@LoadBalanced
	@Bean("restTemplate")
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
