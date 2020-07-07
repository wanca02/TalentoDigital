package com.web.relationships.controllers;

import java.sql.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.relationships.models.License;
import com.web.relationships.models.Person;
import com.web.relationships.services.classService;


@Controller
@RequestMapping("/")
public class LicenseController {
	private final classService service;
	
	public LicenseController(classService service) {
		this.service=service;
	}
	
	@RequestMapping("licenses/new")
	public String Index(Model model, @ModelAttribute("license") License license) {
		List<Person> p = service.showpersons();
		model.addAttribute(license);
		model.addAttribute("persons",p);
		return "license.jsp";
	}
	@RequestMapping(value="licenses/add", method=RequestMethod.POST)
	public String Form(@Valid 
			@RequestParam("personId") Long id,
			@RequestParam("state") String state,
			@RequestParam("expirationDate") Date expirationDate,
			@RequestParam("number") String number) {
		Person p = service.findOnePerson(id);
		License L = new License();
		L.setExpirationDate(expirationDate);
		L.setNumber(NumberLicense(p.getId()));
		L.setState(state);
		L.setPerson(p);
		service.create(L);
		return "redirect:/persons/new";
	}
	public String NumberLicense(Long id) {
		String _id = Long.toString(id);
		String zero="";
		for(int i=0 ; i<(6-_id.length()) ; i++) {
			zero+="0";
		}
		return zero+_id;
	}
}












