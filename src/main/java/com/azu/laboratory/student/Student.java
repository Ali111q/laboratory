package com.azu.laboratory.student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,generator = "student_id_seq"

    )
    @SequenceGenerator(name = "student_id_seq",sequenceName ="student_id_seq", allocationSize = 1)
    private Long id;
    private String name;
    private LocalDate dob;
    @Transient
    private Integer age;

    public Student() {
    }

    public Student(Long id, String name, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }


    public void setAge(Integer age) {
        this.age = age;
    }
    public  Integer getAge(){
        return Period.between(this.dob, LocalDate.now()).getYears();
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
