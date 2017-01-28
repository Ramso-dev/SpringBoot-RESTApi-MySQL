package com.ramso.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication // sae as @Configuration @EnableAutoConfiguration @ComponentScan
//@EnableJpaRepositories(basePackages="com.ramso", entityManagerFactoryRef="emf")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
