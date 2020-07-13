package com.web.estudiantes.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.web.estudiantes.models._Class;
import com.web.estudiantes.models.ClassStudent;
import com.web.estudiantes.models.Contact;
import com.web.estudiantes.models.Dorm;
import com.web.estudiantes.models.DormStudent;
import com.web.estudiantes.models.Student;
import com.web.estudiantes.repositories.ClassRepository;
import com.web.estudiantes.repositories.ClassStudentRepository;
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
	private final ClassRepository repository_C;
	private final ClassStudentRepository repository_CS;

	public ApiService(
			StudentRepository repositoryE, 
			ContactRepository repositoryC, 
			DormRepository repositoryD, 
			DormStudentRepository repositoryDS,
			ClassRepository repository_C, 
			ClassStudentRepository repository_CS) {
		super();
		this.repositoryE = repositoryE;
		this.repositoryC = repositoryC;
		this.repositoryD = repositoryD;
		this.repositoryDS = repositoryDS;
		this.repository_C = repository_C;
		this.repository_CS = repository_CS;
	}
	
//-------------------------------------CREATE METHODS
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
	public void create(_Class entity) {
		repository_C.save(entity);
	}
	public void create(ClassStudent entity) {
		repository_CS.save(entity);
	}
	
	//-------------------------------------DELETE METHODS
	public void deleteDS(Long id) {
		//repositoryDS.delete(entity);
		repositoryDS.deleteById(id);
	}
	public void delete(ClassStudent entity) {
		repository_CS.delete(entity);;
	}
	
//---------------------------------------FINDALL METHODS
	public List<Student> showStudent(){
		return repositoryE.findAll();
	}
	public List<Contact> showContact(){
		return repositoryC.findAll();
	}
	public List<Dorm> showDorms() {
		return repositoryD.findAll();
	}
	public List<_Class> showClasses() {
		return repository_C.findAll();
	}
	
//---------------------------------------FINDbyID METHODS
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
	public _Class findOneClass(Long id) {
		Optional<_Class> _optinal = repository_C.findById(id); 
		if(_optinal.isPresent()) {
			return _optinal.get();
	  } else {
	  	return null;
	  }
	}
	public DormStudent findOneDormStudent(Long dormId, Long studentId) {
		Optional<DormStudent> _optinal = repositoryDS.findByDormIdAndStudentId(dormId, studentId); 
		if(_optinal.isPresent()) {
			return _optinal.get();
	  } else {
	  	return null;
	  }
	}

	

	

	
}












