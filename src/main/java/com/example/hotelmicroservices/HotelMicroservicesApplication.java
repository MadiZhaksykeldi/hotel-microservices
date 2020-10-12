package com.example.hotelmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HotelMicroservicesApplication {
    public static void main(String[] args) {
        SpringApplication.run(HotelMicroservicesApplication.class, args);
    }
}
