package com.web.estudiantes.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.estudiantes.models.Student;
import com.web.estudiantes.models._Class;
import com.web.estudiantes.services.ApiService;

@Controller
public class ClassController {
	private final ApiService service;
	
	public ClassController(ApiService service) {
		this.service = service;
	}
	
	@RequestMapping("/classes/new")
	public String Index(Model model, @ModelAttribute("class") _Class _class) {
		List<_Class> _C = service.showClasses();
		model.addAttribute("classes",_C);
		model.addAttribute(_class);
		return "newClass.jsp";
	}
	@RequestMapping(value="/classes/addClass", method=RequestMethod.POST)
	public String Form(@Valid @ModelAttribute("class") _Class _class) {
		service.create(_class);
		return "redirect:/classes/new";
	}
	
	@RequestMapping("/classes/{id}")
	public String IndexDormStudent(@PathVariable("id") Long id, Model model) {
		String redirect="";
		//List<Student> s = service.showStudent();
		_Class _C = service.findOneClass(id);
		if(_C == null) {
			redirect = "redirect:/dorms/404error";
		}else {
			//model.addAttribute("students",s);
			model.addAttribute("classId",id);
			model.addAttribute("class",_C);
			redirect = "showClass.jsp";
		}
		return redirect;
	}
}












