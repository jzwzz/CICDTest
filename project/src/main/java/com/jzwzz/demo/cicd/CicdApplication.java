package com.jzwzz.demo.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}
}
