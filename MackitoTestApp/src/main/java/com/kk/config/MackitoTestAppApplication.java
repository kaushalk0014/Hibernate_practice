package com.kk.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.kk.test"})
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.kk.test.dao"})
@EntityScan(basePackages="com.kk.test.entity")
public class MackitoTestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MackitoTestAppApplication.class, args);
	}

}
