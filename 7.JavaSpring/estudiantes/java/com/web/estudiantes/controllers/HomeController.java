package com.web.estudiantes.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.estudiantes.models.Contact;
import com.web.estudiantes.models.Student;
import com.web.estudiantes.services.ApiService;

@Controller
public class HomeController {
	private final ApiService service;
		
	public HomeController(ApiService service) {
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
		model.addAttribute(student);
		return "newStudent.jsp";
	}
	@RequestMapping(value="/students/addStudent", method=RequestMethod.POST)
	public String FormStudent(@Valid @ModelAttribute("student") Student student) {
		service.create(student);
		return "redirect:/students/new";
	}
	
	
	
}















