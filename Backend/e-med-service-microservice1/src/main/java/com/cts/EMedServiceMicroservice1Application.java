package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient 
public class EMedServiceMicroservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(EMedServiceMicroservice1Application.class, args);
	}

}
