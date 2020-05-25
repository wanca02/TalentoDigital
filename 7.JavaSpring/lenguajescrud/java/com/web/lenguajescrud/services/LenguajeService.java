package com.web.lenguajescrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.web.lenguajescrud.models.Lenguaje;
import com.web.lenguajescrud.repositories.LenguajeRepository;

@Service
public class LenguajeService {
	private final LenguajeRepository langRepository;
	
	public LenguajeService(LenguajeRepository langRepository) {
		this.langRepository=langRepository;
	}
	
	public List<Lenguaje> showall(){
		return langRepository.findAll();
	}
	
	public Lenguaje create(Lenguaje l) {
		return langRepository.save(l);
	}
	
	public Lenguaje findid(Long id) {
		Optional<Lenguaje> _optinal= langRepository.findById(id);
		if(_optinal.isPresent()) {
      return _optinal.get();
	  } else {
	      return null;
	  }
	}
	
	public Lenguaje update(Lenguaje l) {
		Lenguaje safe = findid(l.getId());
		if(!l.getName().equals(safe.getName()) && !l.getName().equals("")) safe.setName(l.getName());
		if(!l.getCreator().equals(safe.getCreator()) && !l.getCreator().equals("")) safe.setCreator(l.getCreator());
		if(!l.getCurrentVersion().equals(safe.getCurrentVersion()) && !l.getCurrentVersion().equals("")) safe.setCurrentVersion(l.getCurrentVersion());
		langRepository.save(safe);
		return safe;
	}
	
	public void delete(Long id) {
		langRepository.deleteById(id);
	}
}












