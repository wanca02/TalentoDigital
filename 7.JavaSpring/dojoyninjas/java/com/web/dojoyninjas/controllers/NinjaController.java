package com.web.dojoyninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.dojoyninjas.models.Dojo;
import com.web.dojoyninjas.models.Ninja;
import com.web.dojoyninjas.services.MainService;

@Controller
public class NinjaController {
	private final MainService service;
	public NinjaController(MainService service) {
		this.service = service;
	}
	
	@RequestMapping("/ninjas/new")
	public String IndexNinja(Model model) {
		List<Dojo> d = service.showAllDojos();
		model.addAttribute("dojos",d);
		return "newNinja.jsp";
	}
	@RequestMapping(value="/ninjas/addNinja", method=RequestMethod.POST)
	public String FormNinja(@Valid 
			@RequestParam("dojoId") Long dojoId,
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("age") int age) {
		Dojo d = service.findOneDojo(dojoId);
		Ninja n = new Ninja(firstName, lastName, age, d);
		service.create(n);
		return "redirect:/ninjas/new";
	}
}















