package com.web.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.web.lookify.models.Lookify;
import com.web.lookify.repositories.LookifyRepository;

@Service
public class LookifyService {
	private final LookifyRepository repository;
	
	public LookifyService (LookifyRepository repository) {
		this.repository=repository;
	}
	
	public List<Lookify> showall(){
		return repository.findAll();
	}
	
	public Lookify create(Lookify song) {
		return repository.save(song);
	}
	
	public Lookify findid(Long id) {
		Optional<Lookify> _optinal= repository.findById(id);
		if(_optinal.isPresent()) {
      return _optinal.get();
	  } else {
	      return null;
	  }
	}
}











