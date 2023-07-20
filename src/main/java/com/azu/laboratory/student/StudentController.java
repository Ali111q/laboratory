package com.azu.laboratory.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return  studentService.getAllStudents();
    }
    @PostMapping(path = "/add")
    public void addStudent (@RequestBody Student student){
        studentService.addStudent(student);
    }
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long id) throws IllegalAccessException {
        studentService.deleteStudent(id);
    }
    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("student")Long id,
            @RequestParam(required = false) String name
    ) throws IllegalAccessException {
        studentService.updateStudent(id, name);
    }

}
