package com.quinbay.dependencyInjection.service;


import com.quinbay.dependencyInjection.dto.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student getStudent(Long id);
    void addStudent(Student student);
    void update(Student student);
    void delete(Student student);


}
