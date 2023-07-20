package com.azu.laboratory.student;

import jakarta.transaction.Transactional;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<Student> getAllStudents(){
        return  studentRepository.findAll();
    }
    public void addStudent(Student student){

studentRepository.save(student);
    }
    public void deleteStudent(Long id) throws IllegalAccessException {
        Boolean isExist = studentRepository.existsById(id);

        if (!isExist){
            throw new IllegalAccessException("id is not exist");
        }else{
            studentRepository.deleteById(id);
        }
    }
    @Transactional
    public void updateStudent(Long id, String name) throws IllegalAccessException {
        Student student = studentRepository.findById(id).orElseThrow(
                () -> new  IllegalArgumentException("id is not found")
        );

        System.out.println(student);
        student.setName(name);
        studentRepository.save(student); // Save the updated student object
    }
}
