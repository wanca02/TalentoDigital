package com.web.dojoyninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.web.dojoyninjas.models.Dojo;
import com.web.dojoyninjas.models.Ninja;
import com.web.dojoyninjas.repositories.DojoRepository;
import com.web.dojoyninjas.repositories.NinjaRepository;

@Service
public class MainService {
	private final DojoRepository repositoryD;
	private final NinjaRepository repositoryN;
	
	public MainService(DojoRepository repositoryD, NinjaRepository repositoryN) {
		this.repositoryD = repositoryD;
		this.repositoryN = repositoryN;
	}
	
	public void create(Dojo entity) {
		repositoryD.save(entity);
	}
	
	public void create(Ninja entity) {
		repositoryN.save(entity);
	}

	public List<Dojo> showAllDojos() {
		return repositoryD.findAll();
	}

	public Dojo findOneDojo(Long id) {
		Optional<Dojo> d = repositoryD.findById(id);
		return d.get();
	}
	
	
}





















