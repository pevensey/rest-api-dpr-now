package com.example.coba_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.coba_API.controller.PengaduanController;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class}) //disable white label error page
@EnableJpaAuditing
//@EnableConfigurationProperties({
//		FileStorageProperties.class
//})
//@ComponentScan("com.example.coba_API")

public class CobaApiApplication  extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CobaApiApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(CobaApiApplication.class, args);
	}

}
