package com.web.estudiantes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.estudiantes.models.ClassStudent;

@Repository
public interface ClassStudentRepository extends CrudRepository<ClassStudent,Long>{

}
