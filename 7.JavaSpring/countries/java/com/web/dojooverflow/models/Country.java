package com.web.dojooverflow.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="countries")
@NamedQuery(name="Country.findAll", query="SELECT c FROM Country c")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int capital;

	private String code;

	private String code2;

	private String continent;

	private float gnp;

	@Column(name="gnp_old")
	private float gnpOld;

	@Column(name="government_form")
	private String governmentForm;

	@Column(name="head_of_state")
	private String headOfState;

	@Column(name="indep_year")
	private short indepYear;

	@Column(name="life_expectancy")
	private float lifeExpectancy;

	@Column(name="local_name")
	private String localName;

	private String name;

	private int population;

	private String region;

	@Column(name="surface_area")
	private float surfaceArea;

	//bi-directional many-to-one association to City
	@OneToMany(mappedBy="country")
	private List<City> cities;

	//bi-directional many-to-one association to Language
	@OneToMany(mappedBy="country")
	private List<Language> languages;

	public Country() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapital() {
		return this.capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode2() {
		return this.code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	public String getContinent() {
		return this.continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public float getGnp() {
		return this.gnp;
	}

	public void setGnp(float gnp) {
		this.gnp = gnp;
	}

	public float getGnpOld() {
		return this.gnpOld;
	}

	public void setGnpOld(float gnpOld) {
		this.gnpOld = gnpOld;
	}

	public String getGovernmentForm() {
		return this.governmentForm;
	}

	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}

	public String getHeadOfState() {
		return this.headOfState;
	}

	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}

	public short getIndepYear() {
		return this.indepYear;
	}

	public void setIndepYear(short indepYear) {
		this.indepYear = indepYear;
	}

	public float getLifeExpectancy() {
		return this.lifeExpectancy;
	}

	public void setLifeExpectancy(float lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public String getLocalName() {
		return this.localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return this.population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public float getSurfaceArea() {
		return this.surfaceArea;
	}

	public void setSurfaceArea(float surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public List<City> getCities() {
		return this.cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public City addCity(City city) {
		getCities().add(city);
		city.setCountry(this);

		return city;
	}

	public City removeCity(City city) {
		getCities().remove(city);
		city.setCountry(null);

		return city;
	}

	public List<Language> getLanguages() {
		return this.languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public Language addLanguage(Language language) {
		getLanguages().add(language);
		language.setCountry(this);

		return language;
	}

	public Language removeLanguage(Language language) {
		getLanguages().remove(language);
		language.setCountry(null);

		return language;
	}

}