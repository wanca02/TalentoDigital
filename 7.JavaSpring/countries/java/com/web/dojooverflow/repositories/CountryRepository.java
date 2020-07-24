package com.web.dojooverflow.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.dojooverflow.models.Country;


@Repository
public interface CountryRepository extends CrudRepository<Country,Long>{
	@Query("select c.name, l.language, l.percentage from Country c inner join "
			+ "Language l on(c.id=l.country.id) where l.language='Slovene'")
	List<Object[]> findByLanguage();
	
	@Query("SELECT co.name,COUNT(ci.countryCode) FROM Country co INNER JOIN City ci "
			+ "ON(co.code=ci.countryCode) GROUP BY ci.countryCode")
	List<Object[]> findByCountCity();
	
	@Query("SELECT co.code, ci.name, ci.population FROM Country co INNER JOIN City ci "
			+ "ON(co.code=ci.countryCode) WHERE co.name='México' AND ci.population>500000 "
			+ "ORDER BY ci.population DESC")
	List<Object[]> findByCountryAndPopulation();
	
	@Query("SELECT co.name,l.language,l.percentage FROM Country co INNER JOIN Language l "
			+ "ON(co.code=l.countryCode) WHERE l.percentage>89 "
			+ "ORDER BY l.percentage DESC")
	List<Object[]> findByPercentage();
	
	@Query("SELECT co.name, co.surfaceArea,co.population FROM Country co "
			+ "WHERE co.surfaceArea<501 AND co.population>100000")
	List<Object[]> findBySurfaceAreaAndPopulation();
	
	@Query("SELECT co.name,co.governmentForm,co.surfaceArea,co.lifeExpectancy FROM Country co "
			+ "WHERE co.governmentForm='Constitutional Monarchy' "
			+ "AND co.surfaceArea>200 AND co.lifeExpectancy>75")
	List<Object[]> findByGobFormSurfAreaLifeExpe();
	
	@Query("SELECT co.name,ci.name,ci.district,ci.population FROM Country co " + 
			"INNER JOIN City ci ON(co.code=ci.countryCode)" + 
			"WHERE co.name='Argentina'" + 
			"AND ci.district='Buenos Aires' AND ci.population>500000")
	List<Object[]> findByCountryAndDistrictAndPopulation();
	
	@Query("SELECT co.region, COUNT(co.code) as nCountry FROM Country co " + 
			"GROUP BY co.region " + 
			"ORDER BY nCountry DESC")
	List<Object[]> findAllRegion();
	
}










