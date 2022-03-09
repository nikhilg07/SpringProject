package com.quinbay.dependencyInjection.service;


import com.quinbay.dependencyInjection.dto.Student;
import com.quinbay.dependencyInjection.entity.StudentEntity;
import com.quinbay.dependencyInjection.entity.StudentEntityMongoDb;
import com.quinbay.dependencyInjection.repository.StudentMongoDbRepository;
import com.quinbay.dependencyInjection.repository.StudentRedisRepository;
import com.quinbay.dependencyInjection.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

//    @Autowired
//    StudentDb studentDb;



    //--------------------------------           POSTGRES SQL                          -----------------------------------

    /*
         FOR POSTGRES SQL

         STARTS HERE


    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student>getAllStudents(){

        Iterable<StudentEntity> studentEntityList = studentRepository.findAll();// what we got from db
        List<Student>studentResponseList = new ArrayList<>();// this hold that we want to send to client

        for (StudentEntity studentEntity:studentEntityList){

            Student student = new Student(studentEntity.getId(),studentEntity.getName());
//            student.setId(studentEntity.getId());
//            student.setName(studentEntity.getName());

            studentResponseList.add(student);
        }


        return studentResponseList;

    }



    @Override
    public Student getStudent(Long id){
       Optional<StudentEntity> studentEntity = studentRepository.findById(id);
       if(studentEntity.isPresent()) {
           return new Student(studentEntity.get().getId(), studentEntity.get().getName());
       }
       else {
           throw new RuntimeException("Not Found");
       }

    }


    @Override
    public void addStudent(Student student){


        StudentEntity studentEntity = new StudentEntity(student.getId(),student.getName());
        studentRepository.save(studentEntity);

    }

    @Override
    public void delete(Student student){
        StudentEntity studentEntity = new StudentEntity(student.getId(),student.getName());
        studentRepository.delete(studentEntity);

    }

    @Override
    public void update(Student student){

        Long id = student.getId();

        Student std = getStudent(id);

        StudentEntity studentEntity = new StudentEntity(id,student.getName());

        studentRepository.save(studentEntity);


    }


            FOR POSTGRES SQL
            ENDS HERE



*/





/*

///---------------------------------------------       REDIS                           -------------------------------------------------


//                FOR REDIS

//                STARTS HERE



    @Autowired
    StudentRedisRepository studentRedisRepository;


    @Override
    public List<Student> getAllStudents(){

        return studentRedisRepository.findAll();

    }

    @Override
    public void addStudent(Student student){
        studentRedisRepository.insert(student);
    }

    @Override
    public void update(Student student){
        studentRedisRepository.insert(student);
    }

    @Override
    public void delete(Student student){

        studentRedisRepository.deleteOne(student.getId());
    }

    @Override
    public Student getStudent(Long id){

        return studentRedisRepository.findOne(String.valueOf(id));

//        return studentRedisRepository.findOne(String.valueOf(id));

    }




    // FOR REDIS
    // ENDS HERE
*/




//--------------------------------------------------      MONGO DB              ------------------------------------------------



    @Autowired
    StudentMongoDbRepository studentMongoDbRepository;

    @Override
    public List<Student> getAllStudents(){
        Iterable<StudentEntityMongoDb> studentEntityMongoDbList = studentMongoDbRepository.findAll();// what we got from db
        List<Student>studentResponseList = new ArrayList<>();// this hold that we want to send to client

        for (StudentEntityMongoDb studentEntity:studentEntityMongoDbList){

            Student student = new Student(studentEntity.getId(),studentEntity.getName());
//            student.setId(studentEntity.getId());
//            student.setName(studentEntity.getName());

            studentResponseList.add(student);
        }


        return studentResponseList;



    }


    @Override
    public Student getStudent(Long id){
        Optional<StudentEntityMongoDb> studentEntity = studentMongoDbRepository.findById(id);
        if(studentEntity.isPresent()) {
            return new Student(studentEntity.get().getId(), studentEntity.get().getName());
        }
        else {
            throw new RuntimeException("Not Found");
        }

    }

    @Override
    public void addStudent(Student student){


        StudentEntityMongoDb studentEntity = new StudentEntityMongoDb(student.getId(),student.getName());
        studentMongoDbRepository.save(studentEntity);

    }

    @Override
    public void delete(Student student){
        StudentEntityMongoDb studentEntity = new StudentEntityMongoDb(student.getId(),student.getName());
        studentMongoDbRepository.delete(studentEntity);

    }

    @Override
    public void update(Student student){

        Long id = student.getId();

        Student std = getStudent(id);

        StudentEntityMongoDb studentEntity = new StudentEntityMongoDb(id,student.getName());

        studentMongoDbRepository.save(studentEntity);


    }










//
//    @Override
//    public void addStudent(Student student){
//
//
//        Iterable<StudentEntity> studentEntityList = studentRepository.findAll();// what we got from db
//
//        List<Student>studentResponseList = new ArrayList<>();// this hold that we want to send to client
//        studentResponseList.add(student);
//    }

//    @Override
//    public void delete(Student student){
//
//        studentRepository.s
//
//        Iterable<StudentEntity> studentEntityList = studentRepository.findAll();// what we got from db
//        List<Student>studentResponseList = new ArrayList<>();// this hold that we want to send to client
//        studentResponseList.remove(student);
//
//    }


//    @Override
//    public Student getStudent(Integer id){
//
//        for(Student student:studentDb.getStudentList()){
//            if(student.getId() == id) {
//                return student;
//            }
//
//        }
//        return null;
//
//    }
//
//    @Override
//    public void addStudent(Student student){
//        studentDb.getStudentList().add(student);
//    }
//
//    @Override
//    public void update(Student student){
//        for(Student std:studentDb.getStudentList()){
//            if (std.getId()==student.getId()){
//                studentDb.getStudentList().remove(std);
//                studentDb.getStudentList().add(std);
//            }
//        }
//    }
//
//    @Override
//    public void delete(Student student){
//        for (Student std:studentDb.getStudentList() ){
//            if (std.getId()==student.getId()){
//                studentDb.getStudentList().remove(std);
//            }
//        }
//    }



}
