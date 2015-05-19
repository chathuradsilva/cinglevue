package com.cinglevue.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
/*@Configuration
@ComponentScan(basePackageClasses={AnnouncementService.class, AnnouncementRepository.class})
@EnableAutoConfiguration*/
@Configuration
@ComponentScan(basePackages = {"com.cinglevue"})
@EnableAutoConfiguration
@EnableMongoRepositories(basePackages = "com.cinglevue.repository")
public class Cinglevue {
	public static void main(String[] args) {
        SpringApplication.run(Cinglevue.class, args);
    }
}
