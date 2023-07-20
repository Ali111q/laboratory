package com.azu.laboratory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication

public class LaboratoryApplication {

	public static void main(String[] args) {
		System.out.println("hello from ali");
		SpringApplication.run(LaboratoryApplication.class, args);
	}



}
