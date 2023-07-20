package com.azu.laboratory.term;

import com.azu.laboratory.student.Student;
import com.azu.laboratory.student.StudentRepository;
import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class TermConfig {
private    TermRepository termRepository;
private StudentRepository studentRepository;



    public TermConfig(TermRepository termRepository, StudentRepository studentRepository) {
        this.termRepository = termRepository;
        this.studentRepository = studentRepository;

    }

//    @Bean
//    CommandLineRunner commandLineRunner2(){
//        return  args -> {
//            List<Student> student = studentRepository.findAll();
//          Term term1 = new Term(1,"term1");
//          Term term2 = new Term( 2,"term2" );
//
//          term2.setStudents(student);
//          termRepository.saveAll(List.of(term1, term2));
//        };
//    }
}
