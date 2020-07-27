package com.web.lookify.repositories;

import org.springframework.data.repository.CrudRepository;

import com.web.lookify.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
  User findByEmail(String email);
}
