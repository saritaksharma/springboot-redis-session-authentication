package com.sar.springsession.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableWebSecurity
@EnableRedisHttpSession
@RestController
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}
	
	@RequestMapping(value="/order-management/orders")
	public List<Order> getOrders() {

		return Arrays.asList(new Order(1L, "David Cohen", 25.4F), new Order(2L, "Danny Smith", 30.3F), new Order(3L, "Jerry Richardson", 40F));

	}

}
