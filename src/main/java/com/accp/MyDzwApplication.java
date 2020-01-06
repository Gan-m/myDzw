package com.accp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.accp.dao")
@SpringBootApplication
public class MyDzwApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDzwApplication.class, args);
	}

}
