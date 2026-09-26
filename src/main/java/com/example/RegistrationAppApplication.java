package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder; // <-- Add this import
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RegistrationAppApplication extends SpringBootServletInitializer {

    // 1. ADD THIS METHOD FOR EXTERNAL TOMCAT DEPLOYMENT
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RegistrationAppApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(RegistrationAppApplication.class, args);
    }
}
