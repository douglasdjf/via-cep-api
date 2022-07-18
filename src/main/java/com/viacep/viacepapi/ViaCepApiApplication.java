package com.viacep.viacepapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ViaCepApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViaCepApiApplication.class, args);
	}

}
