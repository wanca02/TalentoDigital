package com.web.demo.selfjoin.controllers;

import org.springframework.stereotype.Controller;

import com.web.demo.selfjoin.services.MainService;

@Controller
public class EmployeesController {
	private final MainService service;

	public EmployeesController(MainService service) {
		super();
		this.service = service;
	}

}
