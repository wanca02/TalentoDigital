package com.web.dojoyninjas.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.web.dojoyninjas.models.Ninja;

@Repository
public interface NinjaRepository extends PagingAndSortingRepository<Ninja,Long>{

}
