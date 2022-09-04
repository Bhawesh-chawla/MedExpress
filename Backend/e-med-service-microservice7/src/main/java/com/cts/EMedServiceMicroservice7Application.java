package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EMedServiceMicroservice7Application {

	public static void main(String[] args) {
		SpringApplication.run(EMedServiceMicroservice7Application.class, args);
	}

}
