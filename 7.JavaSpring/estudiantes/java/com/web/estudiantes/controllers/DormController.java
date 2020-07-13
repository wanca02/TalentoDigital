package com.web.estudiantes.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.estudiantes.models.Dorm;
import com.web.estudiantes.models.DormStudent;
import com.web.estudiantes.models.Student;
import com.web.estudiantes.services.ApiService;

@Controller
public class DormController {
	private final ApiService service;
	
	public DormController(ApiService service) {
		this.service = service;
	}
	
	@RequestMapping("/dorms/new")
	public String IndexDorm(Model model, @ModelAttribute("dorm") Dorm dorm) {
		List<Dorm> d = service.showDorms();
		model.addAttribute("dorms",d);
		model.addAttribute(dorm);
		return "newDorm.jsp";
	}
	
	@RequestMapping(value="/dorms/addDorm", method=RequestMethod.POST)
	public String FormDorm(@Valid @ModelAttribute("dorm") Dorm dorm) {
		service.create(dorm);
		return "redirect:/dorms/new";
	}
	
	@RequestMapping("/dorms/{id}")
	public String IndexDormStudent(@PathVariable("id") Long id, Model model) {
		String redirect="";
		List<Student> s = service.showStudent();
		Dorm d = service.findOneDorm(id);
		if(d == null) {
			redirect = "redirect:/dorms/404error";
		}else {
			model.addAttribute("students",s);
			model.addAttribute("dormId",id);
			model.addAttribute("dorm",d);
			redirect = "newDormStudent.jsp";
		}
		return redirect;
	}
	@RequestMapping(value="/dorms/addDormStudent", method=RequestMethod.POST)
	public String FormaDormStudent(@Valid
			@RequestParam("studentId") Long Sid,
			@RequestParam("dormId") Long Did) {
		Dorm d = service.findOneDorm(Did);
		Student s = service.findOneStudent(Sid);
		DormStudent ds = new DormStudent(d, s);
		service.create(ds);
		return "redirect:/dorms/"+Did;
	}
	
	@RequestMapping(value="/dorms/delDormStudent", method=RequestMethod.DELETE)
	public String DeleteDormStudent(@Valid
			@RequestParam("studentId") Long Sid,
			@RequestParam("dormId") Long Did) {
		DormStudent ds = service.findOneDormStudent(Did, Sid);
		service.deleteDS(ds.getId());
		return "redirect:/dorms/"+Did;
	}
	
	@RequestMapping("/dorms/404error")
	public String NotFound() {
		return "notfound.jsp";
	}
}















