package com.web.estudiantes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.estudiantes.models.DormStudent;

@Repository
public interface DormStudentRepository extends CrudRepository<DormStudent,Long>{

}
