package com.web.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.dojooverflow.models.TagQuestion;

@Repository
public interface TagQuestionRepository extends CrudRepository<TagQuestion,Long>{

}
