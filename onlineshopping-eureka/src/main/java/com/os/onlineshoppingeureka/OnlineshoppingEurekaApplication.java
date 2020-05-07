package com.os.onlineshoppingeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OnlineshoppingEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineshoppingEurekaApplication.class, args);
    }

}
