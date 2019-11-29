package com.unicon.api.serviceapicliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceApiClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApiClienteApplication.class, args);
	}

}
