package com.assignments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringDataMVCApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataMVCApplication.class, args);
	}

}
