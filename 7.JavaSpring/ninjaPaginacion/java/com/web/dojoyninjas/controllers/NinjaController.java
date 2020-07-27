package com.web.dojoyninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.dojoyninjas.models.Dojo;
import com.web.dojoyninjas.models.Ninja;
import com.web.dojoyninjas.services.*;

@Controller
public class NinjaController {
	private final MainService service;
	private final NinjaService ninjaService;
	
	public NinjaController(MainService service,NinjaService ninjaService) {
		this.service = service;
		this.ninjaService = ninjaService;
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
	
	@RequestMapping("/pages/{pageNumber}")
	public String getNinjasPerPage(Model model, @PathVariable("pageNumber") int pageNumber) {
	    //Tenemos que restar 1 porque las páginas iterables empiezan con índice 0. Esto es para que nuestros enlaces puedan mostrarse desde 1...maxPage(última página) 
	    Page<Ninja> ninjas = ninjaService.ninjasPerPage(pageNumber - 1);
	    //Total número de páginas que tenemos
	    int totalPages = ninjas.getTotalPages();
	    model.addAttribute("totalPages", totalPages);
	    model.addAttribute("ninjas", ninjas);
	    return "Ninjas.jsp";
	}
	
}















