package com.teoriejava.site_teorie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.teoriejava.site_teorie")
public class SiteTeorieApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiteTeorieApplication.class, args);
	}

}