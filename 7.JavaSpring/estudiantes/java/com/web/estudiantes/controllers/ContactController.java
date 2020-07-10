package com.web.estudiantes.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.estudiantes.models.Contact;
import com.web.estudiantes.models.Student;
import com.web.estudiantes.services.ApiService;

@Controller
public class ContactController {
	private final ApiService service;
		
	public ContactController(ApiService service) {
		super();
		this.service = service;
	}

	@RequestMapping("/contacts/new")
	public String indexStudent(Model model) {
		//model.addAttribute(contact);
		List<Student> s = service.showStudent();
		model.addAttribute("students",s);
		return "newContact.jsp";
	}
	@RequestMapping(value="/contacts/addContact", method=RequestMethod.POST)
	public String FormStudent(@Valid
			@RequestParam("studentId") Long id,
			@RequestParam("address") String address,
			@RequestParam("city") String city,
			@RequestParam("state") String state) {
		Student s = service.findOneStudent(id);
		Contact c = new Contact();
		c.setAddress(address);
		c.setCity(city);
		c.setState(state);
		c.setStudent(s);
		service.create(c);
		return "redirect:/contacts/new";
	}
	
	
	
}















