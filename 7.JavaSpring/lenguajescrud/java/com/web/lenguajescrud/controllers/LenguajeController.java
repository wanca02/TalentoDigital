package com.web.lenguajescrud.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.lenguajescrud.models.Lenguaje;
import com.web.lenguajescrud.services.LenguajeService;

@Controller
public class LenguajeController {
	private final LenguajeService langService;
	
	public LenguajeController(LenguajeService langService) {
		this.langService=langService;
	}
	
	@RequestMapping("/languages")
	public String index(Model model, @ModelAttribute("lang") Lenguaje lang) {
		List<Lenguaje> lenguaje= langService.showall();
		model.addAttribute("langs", lenguaje);
		return "index.jsp";
	}
	
	@RequestMapping(value="/languages/add", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("lang") Lenguaje lang) {
		langService.create(lang);
		return "redirect:/languages";
	}
	
	@RequestMapping("/languages/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		Lenguaje l= langService.findid(id);
		model.addAttribute("lang",l);
		return "show.jsp";
	}
	
	@RequestMapping("/languages/edit/{id}")
	public String edit(Model model, @PathVariable("id") Long id) {
		Lenguaje l= langService.findid(id);
		model.addAttribute("lang",l);
		return "edit.jsp";
	}
	
	@RequestMapping(value= "/languages/{id}", method= RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("lang") Lenguaje lang) {
		langService.update(lang);
		return "redirect:/languages";
	}
	
	@RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") Long id) {
		langService.delete(id);
		return "redirect:/languages";
	}
}
















