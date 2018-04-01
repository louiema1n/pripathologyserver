package com.lm.pripathologyserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lm.pripathologyserver.mapper")
public class PripathologyserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(PripathologyserverApplication.class, args);
	}
}
