package com.quinbay.dependencyInjection.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @NotBlank(message = "Student cant be empty")
    private String name;

    public StudentEntity(Long id, @NotBlank(message = "Student cant be empty") String name) {
        this.id = id;
        this.name = name;
    }

    public StudentEntity(){

    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
