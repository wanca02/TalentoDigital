package com.web.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.web.relationships.models.License;
import com.web.relationships.models.Person;
import com.web.relationships.repositories.LicenseRepository;
import com.web.relationships.repositories.PersonRepository;


@Service
public class classService {
	private final PersonRepository repositoryp;
	private final LicenseRepository repositoryl;
	
	public classService (
			PersonRepository repositoryp, 
			LicenseRepository repositoryl) {
		this.repositoryl = repositoryl;
		this.repositoryp=repositoryp;
	}

	public void create(Person person) {
		repositoryp.save(person);
	}
	
	public void create(License license) {
		repositoryl.save(license);
	}
	
	public List<Person> showpersons() {
		return repositoryp.findAll();
	}
	public List<License> showlicenses() {
		return repositoryl.findAll();
	}
	
	public Person findOnePerson(Long id){
		Optional<Person> o = repositoryp.findById(id);
		return o.get();
	}
	public License findOneLicense(Long id){
		Optional<License> o = repositoryl.findByPersonId(id);
		return o.get();
	}

	public List<Person> findAll() {
		return repositoryp.findAll();
	}
}













