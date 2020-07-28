package com.web.repasoexamen.services;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.web.repasoexamen.models.Event;
import com.web.repasoexamen.models.User;
import com.web.repasoexamen.repositories.EventRepository;
import com.web.repasoexamen.repositories.UserRepository;


@Service
public class MainService {
    private final UserRepository userRepository;
    private final EventRepository repositoryE;
    
    public MainService(UserRepository userRepository, EventRepository repositoryE) {
        this.userRepository = userRepository;
        this.repositoryE = repositoryE;
    }
    
    // registrar el usuario y hacer Hash a su password
    public User registerUser(User user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return userRepository.save(user);
    }
    public Event create(Event entity) {
    	return repositoryE.save(entity);
    }
    
    // encontrar un usuario por su email
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
    // encontrar un usuario por su id
    public User findUserById(Long id) {
    	Optional<User> u = userRepository.findById(id);
    	if(u.isPresent()) {
            return u.get();
    	} else {
    	    return null;
    	}
    }
    
    
    // autenticar usuario
    public boolean authenticateUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        if(user == null) {
            return false;
        } else {
            if(BCrypt.checkpw(password, user.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }
    
    public List<Event> showEvents(String location){
    	return repositoryE.findByLocation(location);
    }
    public List<Event> showEventsNot(String location){
    	return repositoryE.findByLocationNot(location);
    }

		public Event findEventById(Long user_id, Long event_id) {
			Optional<Event> o = repositoryE.findByUserIdAndId(user_id, event_id);
			if(o.isPresent()) {
        return o.get();
			} else {
			    return null;
			}
		}
		
		public Event findEvent(Long event_id) {
			Optional<Event> o = repositoryE.findById(event_id);
			if(o.isPresent()) {
        return o.get();
			} else {
			    return null;
			}
		}

		public Event update(Date date, String location, String name, Long id) {
			Event e = findEvent(id);
			e.setDate(date);
			e.setLocation(location);
			e.setName(name);
			return repositoryE.save(e);
		}

		public void delete(Long event_id, Long userId) {
			Event e = findEventById(userId, event_id);
			repositoryE.deleteById(e.getId());
		}
}







