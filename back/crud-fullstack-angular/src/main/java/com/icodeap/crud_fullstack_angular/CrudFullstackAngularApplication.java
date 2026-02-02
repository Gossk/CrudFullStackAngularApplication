package com.icodeap.crud_fullstack_angular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class CrudFullstackAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudFullstackAngularApplication.class, args);
	}

}
