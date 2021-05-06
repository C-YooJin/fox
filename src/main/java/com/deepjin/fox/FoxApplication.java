package com.deepjin.fox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class FoxApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoxApplication.class, args);
    }

}
