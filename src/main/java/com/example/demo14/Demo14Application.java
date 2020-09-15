package com.example.demo14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
@ComponentScan(basePackages = {"com.example.hello"})
public class Demo14Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo14Application.class, args);
		System.out.println("harsh");
	}

}
