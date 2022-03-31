package com.legallynx.eureka.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LegallynxServiceRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LegallynxServiceRegistryApplication.class, args);
    }
}