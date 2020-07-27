package com.web.demo.selfjoin.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.demo.selfjoin.models.Employees;

@Repository
public interface EmployRepository extends CrudRepository<Employees,Long>{

}
