package com.udacity.vehiclemicroserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class VehiclemicroserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehiclemicroserverApplication.class, args);
	}

}
