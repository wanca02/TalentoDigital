package com.web.estudiantes.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.web.estudiantes.models.Contact;
import com.web.estudiantes.models.Student;
import com.web.estudiantes.repositories.ContactRepository;
import com.web.estudiantes.repositories.StudentRepository;

@Service
public class ApiService {
	private final StudentRepository repositoryE;
	private final ContactRepository repositoryC;

	public ApiService(StudentRepository repositoryE, ContactRepository repositoryC) {
		super();
		this.repositoryE = repositoryE;
		this.repositoryC = repositoryC;
	}
	
	public void create(Student entity) {
		repositoryE.save(entity);
	}
	public void create(Contact entity) {
		repositoryC.save(entity);
	}
	
	public List<Student> showStudent(){
		return repositoryE.findAll();
	}
	public List<Contact> showContact(){
		return repositoryC.findAll();
	}

	public Student findOneStudent(Long id) {
		Optional<Student> s = repositoryE.findById(id); 
		return s.get();
	}
}












