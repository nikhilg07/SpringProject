package com.quinbay.dependencyInjection.controller;

import com.quinbay.dependencyInjection.dto.Student;
import com.quinbay.dependencyInjection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import javax.validation.Valid;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping(value = "/student" , produces = "application/json")
    public List<Student> getStudents(){

        return studentService.getAllStudents();
    }

    @GetMapping(value = "/studentparam",produces = "application/json")
    public Student getStudent(@RequestParam Long id){
        return studentService.getStudent(id);
    }

//    http://localhost:8080/studentparam/?id=4



    @PostMapping(value = "/students" , consumes = "application/json")
    public void addStudent(@RequestBody @Valid Student student){
        studentService.addStudent(student);
    }




    @PutMapping(value = "/studentsUpdate" , consumes = "application/json")
    public boolean putStudent(@RequestBody Student student){
        studentService.update(student);
        return true;
    }

    @DeleteMapping(value = "/studentDelete" , consumes = "application/json")
    public void deleteStudent(@RequestBody Student student){
        studentService.delete(student);
    }



}
