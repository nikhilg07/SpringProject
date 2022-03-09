package com.quinbay.dependencyInjection.dto;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class Student implements Serializable  {

    private Long id;

    @NotBlank(message = "Student name cant be none")
    private String name;

    public Student(Long id, @NotBlank(message = "Student name cant be none") String name) {
        this.id = id;
        this.name = name;
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
    //   @NotBlank(message = "Student name cant be none")
  //  private String name;
//    private String lName;
//    private String branch;

//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
////
//    public Student(int id, String name, String lName, String branch) {
//        this.id = id;
//        this.fName = fName;
//        this.lName = lName;
//        this.branch = branch;
//    }

    public Student() {
    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getfName() {
//        return fName;
//    }
//
//    public void setfName(String fName) {
//        this.fName = fName;
//    }
//
//    public String getlName() {
//        return lName;
//    }
//
//    public void setlName(String lName) {
//        this.lName = lName;
//    }
//
//    public String getBranch() {
//        return branch;
//    }
//
//    public void setBranch(String branch) {
//        this.branch = branch;
//    }
}
