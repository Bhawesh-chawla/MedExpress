package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EMedServiceMicroservice6Application {

	public static void main(String[] args) {
		SpringApplication.run(EMedServiceMicroservice6Application.class, args);
	}

}
