package com.web.prodycateg.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.web.prodycateg.models.Category;
import com.web.prodycateg.models.CategoryProduct;
import com.web.prodycateg.models.Product;
import com.web.prodycateg.repositories.CategoProdRepository;
import com.web.prodycateg.repositories.CategoRepository;
import com.web.prodycateg.repositories.ProdRepository;

@Service
public class MainService {
	private final ProdRepository repositoryP;
	private final CategoRepository repositoryC;
	private final CategoProdRepository repositoryCP;
	
	public MainService(
			ProdRepository repositoryP, 
			CategoRepository repositoryC,
			CategoProdRepository repositoryCP) {
		this.repositoryP = repositoryP; 
		this.repositoryC = repositoryC;
		this.repositoryCP = repositoryCP;
	}
	
	public void create(Product entity) {
		repositoryP.save(entity);
	}
	public void create(Category entity) {
		repositoryC.save(entity);
	}
	public void create(CategoryProduct entity) {
		repositoryCP.save(entity);
	}
	
	public List<Product> showProducts(){
		return repositoryP.findAll();
	}
	public List<Category> showCategories(){
		return repositoryC.findAll();
	}
	public Product findOneProd(Long id) {
		Optional<Product> o = repositoryP.findById(id);
		if(o.isPresent()) return o.get();
		else return null;
	}

	public Category findOneCate(Long id) {
		Optional<Category> o = repositoryC.findById(id);
		if(o.isPresent()) return o.get();
		else return null;
	}

	
}















