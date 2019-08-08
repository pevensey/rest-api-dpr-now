package com.example.coba_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.coba_API.controller.PengaduanController;

@SpringBootApplication(scanBasePackages={
		"com.example.coba_API.service","com.example.coba_API.property"})
@EnableJpaAuditing
//@EnableConfigurationProperties({
//		FileStorageProperties.class
//})
@ComponentScan(basePackageClasses= PengaduanController.class)
public class CobaApiApplication  extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CobaApiApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(CobaApiApplication.class, args);
	}

}
