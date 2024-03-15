package com.rouvsen.globalexceptionhandling;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GlobalExceptionHandlingApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(GlobalExceptionHandlingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello, Github!");
    }
}
