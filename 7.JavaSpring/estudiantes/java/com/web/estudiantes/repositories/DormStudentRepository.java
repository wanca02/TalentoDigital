package com.web.estudiantes.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.estudiantes.models.DormStudent;

@Repository
public interface DormStudentRepository extends CrudRepository<DormStudent,Long>{
	Optional<DormStudent> findByDormIdAndStudentId(Long dormId, Long studentId);
}
