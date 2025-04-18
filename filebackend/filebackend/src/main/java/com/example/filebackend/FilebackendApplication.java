package com.example.filebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class FilebackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilebackendApplication.class, args);
	}

}
