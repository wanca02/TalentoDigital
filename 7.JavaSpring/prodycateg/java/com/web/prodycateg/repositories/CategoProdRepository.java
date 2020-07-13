package com.web.prodycateg.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.prodycateg.models.CategoryProduct;

@Repository
public interface CategoProdRepository extends CrudRepository<CategoryProduct, Long>{
	//List<CategoryProduct> findByIdNot(Long id);
}
