package com.azu.laboratory.term;

import com.azu.laboratory.student.Student;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Term {
    @Id
    @SequenceGenerator(
            name = "term_id_seq",
            sequenceName = "term_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "term_id_seq",
            strategy = GenerationType.IDENTITY
    )
    private Integer id;
    private String name;

    public Term() {
    }

    public Term(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @OneToMany
    List<Student> students;

    public Integer getId() {
        return id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Term{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
