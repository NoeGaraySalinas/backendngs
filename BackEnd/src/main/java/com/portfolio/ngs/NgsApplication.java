package com.portfolio.ngs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class NgsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NgsApplication.class, args);
	}

}
