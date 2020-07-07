package com.web.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.relationships.models.License;
import com.web.relationships.models.Person;
import com.web.relationships.services.classService;


@Controller
@RequestMapping("/")
public class PersonController {
	private final classService service;
	
	public PersonController(classService service) {
		this.service=service;
	}
	
	@RequestMapping("persons/new")
	public String Index(Model model, @ModelAttribute("person") Person person) {
		model.addAttribute(person);
		return "person.jsp";
	}
	@RequestMapping(value="persons/add", method=RequestMethod.POST)
	public String Form(@Valid @ModelAttribute("person") Person person) {
		service.create(person);
		return "redirect:/persons/new";
	}
	@RequestMapping("persons/{id}")
	public String Show(Model model, @PathVariable("id") Long id) {
		Person p = service.findOnePerson(id);
		License l = service.findOneLicense(id);
		model.addAttribute("person",p);
		model.addAttribute("license",l);
		return "show.jsp";
	}
}












