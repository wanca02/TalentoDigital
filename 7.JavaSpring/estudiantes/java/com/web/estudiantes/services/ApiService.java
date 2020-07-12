package com.web.estudiantes.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.web.estudiantes.models.Contact;
import com.web.estudiantes.models.Dorm;
import com.web.estudiantes.models.DormStudent;
import com.web.estudiantes.models.Student;
import com.web.estudiantes.repositories.ContactRepository;
import com.web.estudiantes.repositories.DormRepository;
import com.web.estudiantes.repositories.DormStudentRepository;
import com.web.estudiantes.repositories.StudentRepository;

@Service
public class ApiService {
	private final StudentRepository repositoryE;
	private final ContactRepository repositoryC;
	private final DormRepository repositoryD;
	private final DormStudentRepository repositoryDS;

	public ApiService(
			StudentRepository repositoryE, 
			ContactRepository repositoryC, 
			DormRepository repositoryD, 
			DormStudentRepository repositoryDS) {
		super();
		this.repositoryE = repositoryE;
		this.repositoryC = repositoryC;
		this.repositoryD = repositoryD;
		this.repositoryDS = repositoryDS;
	}
	
	public void create(Student entity) {
		repositoryE.save(entity);
	}
	public void create(Contact entity) {
		repositoryC.save(entity);
	}
	public void create(Dorm entity) {
		repositoryD.save(entity);
	}
	public void create(DormStudent entity) {
		repositoryDS.save(entity);
	}
	
	public List<Student> showStudent(){
		return repositoryE.findAll();
	}
	public List<Contact> showContact(){
		return repositoryC.findAll();
	}

	public Student findOneStudent(Long id) {
		Optional<Student> _optinal = repositoryE.findById(id); 
		if(_optinal.isPresent()) {
      return _optinal.get();
	  } else {
	      return null;
	  }
	}
	public Dorm findOneDorm(Long id) {
		Optional<Dorm> _optinal = repositoryD.findById(id); 
		if(_optinal.isPresent()) {
			return _optinal.get();
	  } else {
	  	return null;
	  }
	}

	public List<Dorm> showDorms() {
		return repositoryD.findAll();
	}
}












