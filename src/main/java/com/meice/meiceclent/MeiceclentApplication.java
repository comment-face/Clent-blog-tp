package com.meice.meiceclent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Import;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class MeiceclentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeiceclentApplication.class, args);
	}
}
