package com.web.lenguajescrud.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.lenguajescrud.models.Lenguaje;


@Repository
public interface LenguajeRepository extends CrudRepository<Lenguaje, Long>{
	List<Lenguaje> findAll();
}
