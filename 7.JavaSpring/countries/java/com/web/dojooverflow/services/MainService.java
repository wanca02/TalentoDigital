package com.web.dojooverflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.web.dojooverflow.repositories.CountryRepository;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class MainService {
	private final CountryRepository repositoryC;
	
	public MainService(CountryRepository repositoryC) {
		this.repositoryC = repositoryC;
	}
	
	public List<Object[]> ShowCountryByLanguage(){
		return repositoryC.findByLanguage();
	}
	
	public List<Object[]> ShowAllCityPerCountry(){
		return repositoryC.findByCountCity();
	}
	
	public List<Object[]> ShowCityPerCountryAndPopulation(){
		return repositoryC.findByCountryAndPopulation();
	}
	
	public List<Object[]> ShowCountryAndPercentage(){
		return repositoryC.findByPercentage();
	}
	
	public List<Object[]> ShowCountryBySurfAreaAndPopulation(){
		return repositoryC.findBySurfaceAreaAndPopulation();
	}
	
	public List<Object[]> ShowCountryByGobFormAndSurfAreaAndLifeExpec(){
		return repositoryC.findByGobFormSurfAreaLifeExpe();
	}
	
	public List<Object[]> ShowCityByCountryAndDistrAndPopulation(){
		return repositoryC.findByCountryAndDistrictAndPopulation();
	}
	
	public List<Object[]> ShowRegion(){
		return repositoryC.findAllRegion();
	}
}















