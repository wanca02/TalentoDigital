package com.web.dojooverflow.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.dojooverflow.services.MainService;


@Controller
public class CountryController {
	private MainService service;

	public CountryController(MainService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping("/")
	public String Index(Model model) {
		List<Object[]> q1 = service.ShowCountryByLanguage();
		List<Object[]> q2 = service.ShowAllCityPerCountry();
		List<Object[]> q3 = service.ShowCityPerCountryAndPopulation();
		List<Object[]> q4 = service.ShowCountryAndPercentage();
		List<Object[]> q5 = service.ShowCountryBySurfAreaAndPopulation();
		List<Object[]> q6 = service.ShowCountryByGobFormAndSurfAreaAndLifeExpec();
		List<Object[]> q7 = service.ShowCityByCountryAndDistrAndPopulation();
		List<Object[]> q8 = service.ShowRegion();
		//System.out.println(c.get(0)[1]);
		model.addAttribute("pregunta1",q1);
		model.addAttribute("pregunta2",q2);
		model.addAttribute("pregunta3",q3);
		model.addAttribute("pregunta4",q4);
		model.addAttribute("pregunta5",q5);
		model.addAttribute("pregunta6",q6);
		model.addAttribute("pregunta7",q7);
		model.addAttribute("pregunta8",q8);
		return "index.jsp";
	}
}























