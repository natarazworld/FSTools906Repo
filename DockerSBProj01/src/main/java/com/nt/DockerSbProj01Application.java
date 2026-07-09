package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerSbProj01Application {

	public static void main(String[] args) {
		SpringApplication.run(DockerSbProj01Application.class, args);
		System.out.println("Welcome to Docker Spring Boot Apps");
	}

}
