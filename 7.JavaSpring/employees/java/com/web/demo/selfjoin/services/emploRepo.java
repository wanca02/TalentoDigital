package com.web.demo.selfjoin.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.web.demo.selfjoin.models.Employees;
import com.web.demo.selfjoin.repositories.EmployRepository;

@Service
public class emploRepo {
	private static EmployRepository repositoryU;

	public static Employees findOne(Long valueOf) {
		// TODO Auto-generated method stub
		Optional<Employees> o = repositoryU.findById(valueOf);
		return o.get();
	}

}
