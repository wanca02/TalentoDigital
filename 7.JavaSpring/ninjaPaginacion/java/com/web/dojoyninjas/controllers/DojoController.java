package com.web.dojoyninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.dojoyninjas.models.Dojo;
import com.web.dojoyninjas.services.MainService;

@Controller
public class DojoController {
	private final MainService service;
	public DojoController(MainService service) {
		this.service = service;
	}
	
	@RequestMapping("dojos/{id}")
	public String Index(@PathVariable("id") Long id, Model model) {
		Dojo d = service.findOneDojo(id);
		model.addAttribute("dojos",d);
		return "show.jsp";
	}
	
	@RequestMapping("/dojos/new")
	public String IndexDojo(Model model, @ModelAttribute("dojo") Dojo dojo) {
		model.addAttribute(dojo);
		return "newDojo.jsp";
	}
	@RequestMapping(value="/dojos/addDojo",method=RequestMethod.POST)
	public String FormDojo(@Valid @ModelAttribute("dojo") Dojo dojo) {
		service.create(dojo);
		return "redirect:/dojos/new";
	}
	
}












