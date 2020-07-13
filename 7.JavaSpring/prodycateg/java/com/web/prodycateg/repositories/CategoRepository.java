package com.web.prodycateg.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.prodycateg.models.Category;

@Repository
public interface CategoRepository extends CrudRepository<Category,Long>{
	List<Category> findAll();
	Optional<Category> findById(Long id);
}
