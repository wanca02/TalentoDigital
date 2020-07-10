package com.web.estudiantes.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.estudiantes.models.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact,Long>{
	List<Contact> findAll();
}
