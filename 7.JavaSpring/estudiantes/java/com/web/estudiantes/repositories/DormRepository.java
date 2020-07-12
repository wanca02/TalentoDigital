package com.web.estudiantes.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.estudiantes.models.Dorm;

@Repository
public interface DormRepository extends CrudRepository<Dorm,Long> {
	List<Dorm> findAll();
	Optional<Dorm> findById(Long id);
}
