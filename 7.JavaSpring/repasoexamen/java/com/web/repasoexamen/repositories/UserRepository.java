package com.web.repasoexamen.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.web.repasoexamen.models.User;

public interface UserRepository extends CrudRepository<User,Long>{

	User findByEmail(String email);
	
}
