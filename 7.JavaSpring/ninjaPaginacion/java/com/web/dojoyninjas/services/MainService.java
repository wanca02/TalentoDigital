package com.web.dojoyninjas.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.web.dojoyninjas.models.Dojo;
import com.web.dojoyninjas.models.Ninja;
import com.web.dojoyninjas.repositories.DojoRepository;
import com.web.dojoyninjas.repositories.NinjaRepository;

@Service
@Transactional
public class MainService {
	private final DojoRepository repositoryD;
	private final NinjaRepository repositoryN;
	@Autowired 
  DojoRepository dojoRepo;
  //la variable estática establece el número de ninjas que queremos mostrar por página.
  private static final int PAGE_SIZE = 5;
	
	public MainService(DojoRepository repositoryD, NinjaRepository repositoryN) {
		this.repositoryD = repositoryD;
		this.repositoryN = repositoryN;
	}
	
	public Page<Dojo> dojosPerPage(int pageNumber) {
    // Obtener todas las páginas de ninjas y clasificarlas en orden ascendente por apellido.
    PageRequest pageRequest = PageRequest.of(pageNumber, PAGE_SIZE, Sort.by(Sort.Direction.ASC, "id"));
    Page<Dojo> dojos = dojoRepo.findAll(pageRequest);
    return dojos;
	}
	
	public void create(Dojo entity) {
		repositoryD.save(entity);
	}
	
	public void create(Ninja entity) {
		repositoryN.save(entity);
	}

	public List<Dojo> showAllDojos() {
		return (List<Dojo>) repositoryD.findAll();
	}

	public Dojo findOneDojo(Long id) {
		Optional<Dojo> d = repositoryD.findById(id);
		return d.get();
	}
	
	
}





















