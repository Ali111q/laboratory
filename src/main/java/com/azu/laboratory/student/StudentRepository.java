package com.azu.laboratory.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    //SELECT * FROM student WHERE name = ?
    @Query("SELECT s FROM Student s WHERE s.name = :name")

    Optional<Student> finaStudentByName(String name);
}
