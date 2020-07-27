package com.web.demo.selfjoin.services;

import org.springframework.stereotype.Service;

import com.web.demo.selfjoin.repositories.EmployRepository;

@Service
public class MainService {
	private final EmployRepository repositoryU;

	public MainService(EmployRepository repositoryU) {
		super();
		this.repositoryU = repositoryU;
	}
}












