package com.web.repasoexamen.repositories;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.repasoexamen.models.Event;

@Repository
public interface EventRepository extends CrudRepository<Event,Long>{
	List<Event> findByLocation(String location);
	List<Event> findByLocationNot(String location);
	Optional<Event> findByUserIdAndId(Long user_id,Long event_id);
	
}










