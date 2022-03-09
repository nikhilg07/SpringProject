package com.quinbay.dependencyInjection.repository;

import com.quinbay.dependencyInjection.entity.StudentEntityMongoDb;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMongoDbRepository extends MongoRepository<StudentEntityMongoDb,Long> {
}
