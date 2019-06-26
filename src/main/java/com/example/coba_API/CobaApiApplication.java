package com.example.coba_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.coba_API.controller.HotelController;

@SpringBootApplication
@EnableJpaAuditing

@ComponentScan(basePackageClasses=HotelController.class)
public class CobaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CobaApiApplication.class, args);
	}

}
