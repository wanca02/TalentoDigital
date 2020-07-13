package com.web.estudiantes.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.estudiantes.models.ClassStudent;
import com.web.estudiantes.models.Contact;
import com.web.estudiantes.models.Student;
import com.web.estudiantes.models._Class;
import com.web.estudiantes.services.ApiService;

@Controller
public class StudentController {
	private final ApiService service;
		
	public StudentController(ApiService service) {
		this.service = service;
	}

	@RequestMapping("/students")
	public String Index(Model model) {
		List<Student> s = service.showStudent();
		//List<Contact> c = service.showContact();
		model.addAttribute("students",s);
		return "index.jsp";
	}
	
	@RequestMapping("/students/new")
	public String indexStudent(Model model, @ModelAttribute("student") Student student) {
		List<Student> s = service.showStudent();
		model.addAttribute("students", s);
		model.addAttribute(student);
		return "newStudent.jsp";
	}
	@RequestMapping(value="/students/addStudent", method=RequestMethod.POST)
	public String FormStudent(@Valid @ModelAttribute("student") Student student) {
		service.create(student);
		return "redirect:/students/new";
	}
	
	@RequestMapping("/students/{id}")
	public String Show(@PathVariable("id") Long id, Model model) {
		Student s = service.findOneStudent(id);
		List<_Class> _C = service.showClasses();
		List<_Class> _C1 = new ArrayList<_Class>();
		for(_Class _class : _C) {
			if(!s.getClasses().contains(_class)) _C1.add(_class);
		}
		model.addAttribute("_student",s);
		model.addAttribute("classes",_C1);
		return "newClassStudent.jsp";
	}
	@RequestMapping(value="/students/addClassStudent", method=RequestMethod.POST)
	public String FormClassStudent(@Valid
			@RequestParam("classId") Long Cid,
			@RequestParam("studentId") Long Sid) {
		Student s = service.findOneStudent(Sid);
		_Class _c = service.findOneClass(Cid);
		ClassStudent cs = new ClassStudent(s,_c);
		service.create(cs);
		return "redirect:/students/"+Sid;
	}
	
	@RequestMapping(value="/students/delClassStudent", method=RequestMethod.DELETE)
	public String DeleteClassStudent(@Valid
			@RequestParam("classId") Long Cid,
			@RequestParam("studentId") Long Sid) {
		Student s = service.findOneStudent(Sid);
		_Class _c = service.findOneClass(Cid);
		ClassStudent cs = new ClassStudent(s,_c);
		service.delete(cs);
		return "redirect:/students/"+Sid;
	}
}















