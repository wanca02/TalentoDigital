package com.web.dojoyninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.web.dojoyninjas.models.Dojo;

@Repository
public interface DojoRepository extends PagingAndSortingRepository<Dojo,Long>{

}
