package com.web.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.dojooverflow.models.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag,Long>{

}
