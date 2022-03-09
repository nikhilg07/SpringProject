package com.quinbay.dependencyInjection.repository;

import com.quinbay.dependencyInjection.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/*


FOR POSTGRES SQL

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity,Long> {

}
*/


@Repository
public interface StudentRepository extends CrudRepository<StudentEntity,Long> {

}
