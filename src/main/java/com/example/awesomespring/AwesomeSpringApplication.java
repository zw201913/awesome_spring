package com.example.awesomespring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.example.awesomespring.dao.mapper")
@SpringBootApplication
public class AwesomeSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwesomeSpringApplication.class, args);
	}

}
