package com.azu.laboratory.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    private final StudentRepository studentRepository;

    public StudentConfig(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            Student ali = new Student(1L, "Ali", LocalDate.of(2004, Month.JANUARY, 5));
            Student maream = new Student(2L, "maream", LocalDate.of(2003, Month.JANUARY, 5));
        studentRepository.saveAll(List.of(ali, maream));
        };
    }
}
