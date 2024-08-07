package com.springdatajpa.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.springdatajpa.springdatajpa.service","com.springdatajpa.springdatajpa.Model","com.springdatajpa.springdatajpa.controller"})
public class SpringdatajpaApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

}
