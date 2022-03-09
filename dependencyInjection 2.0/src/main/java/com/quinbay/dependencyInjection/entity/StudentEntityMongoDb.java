package com.quinbay.dependencyInjection.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.persistence.Id;

@Document(collection = "student")
public class StudentEntityMongoDb {

    @MongoId
    private Long id;

    private String name;

    public StudentEntityMongoDb(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public StudentEntityMongoDb(){

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
}



