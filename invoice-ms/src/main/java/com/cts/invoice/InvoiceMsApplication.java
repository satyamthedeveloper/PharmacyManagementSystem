package com.cts.invoice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients("com.cts.ExchangeServiceProxy")
public class InvoiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoiceMsApplication.class, args);
	}

}
