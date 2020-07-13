package com.web.estudiantes.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.estudiantes.models._Class;

@Repository
public interface ClassRepository extends CrudRepository<_Class,Long>{
	List<_Class> findAll();
}
