package com.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class}) //disable white label error page
@EnableJpaAuditing
//@EnableConfigurationProperties({
//		FileStorageProperties.class
//})
//@ComponentScan("com.example.coba_API")

public class RestApplication extends SpringBootServletInitializer {
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RestApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}
