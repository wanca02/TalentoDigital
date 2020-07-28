package com.web.repasoexamen.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.repasoexamen.models.Event;
import com.web.repasoexamen.models.User;
import com.web.repasoexamen.services.MainService;


@Controller
public class EventController {
	private final MainService service;
  
  public EventController(MainService service) {
      this.service = service;
  }
  
  @RequestMapping("/events")
  public String home(HttpSession session, Model model, @ModelAttribute("event") Event event) {
  	Long userId = (Long) session.getAttribute("userId");
  	User u = service.findUserById(userId);
  	List<Event> e = service.showEvents(u.getLocation());
  	List<Event> en = service.showEventsNot(u.getLocation());
  	model.addAttribute("user",u);
  	model.addAttribute("events",e);
  	model.addAttribute("_events",en);
  	model.addAttribute(event);
  	return "home.jsp";
  }
  @RequestMapping(value="/events/addEvent", method=RequestMethod.POST)
  public String NewEvent(@ModelAttribute("event") Event event, HttpSession session) {
  	Long userId = (Long) session.getAttribute("userId");
  	User u = service.findUserById(userId);
  	event.setUser(u);
  	service.create(event);
  	return "redirect:/events";
  }
  
  @RequestMapping(value="/events/addUserEvent", method=RequestMethod.POST)
  public String NewUserEvent(HttpSession session,
  		@RequestParam("evenId") Long eventId, 
  		@RequestParam("userId") Long usertId) {
  	Long user = (Long) session.getAttribute("userId");
  	Event e = service.findEventById(usertId, eventId);
  	User u = service.findUserById(user);
  	//u.getRelevents().add(e);
  	e.getRelausers().add(u);
  	service.create(e);
  	return "redirect:/events";
  }
  
  @RequestMapping(value="/events/cancelUserEvent", method=RequestMethod.POST)
  public String CancelUserEvent(HttpSession session,
  		@RequestParam("evenId") Long eventId, 
  		@RequestParam("userId") Long usertId) {
  	Long user = (Long) session.getAttribute("userId");
  	User u = service.findUserById(user);
  	Event e = service.findEventById(usertId, eventId);
  	//u.getRelevents().add(e);
  	e.getRelausers().remove(u);
  	service.create(e);
  	return "redirect:/events";
  }
  @RequestMapping("/events/{id}")
  public String ShowEvent(@PathVariable("id") Long id, @ModelAttribute("event") Event event,Model model) {
  	Event e = service.findEvent(id);
  	model.addAttribute("_event",e);
  	model.addAttribute(event);
  	return "edit.jsp";
  }
  @RequestMapping(value="/events/editEvent", method= RequestMethod.PUT)
  public String EditEvent(@Valid
  		@RequestParam("eventId") Long event_id,
  		@RequestParam("name") String name,
  		@RequestParam("location") String location,
  		@RequestParam("date") Date date) {
  	service.update(date, location, name, event_id);
  	return "redirect:/events";
  }
  
  @RequestMapping(value="/events/deleteEvent", method= RequestMethod.DELETE)
  public String DeleteEvent(@Valid
  		@RequestParam("eventId") Long eventId,
  		@RequestParam("userId") Long userId) {
  	User u = service.findUserById(userId);
  	Event e = service.findEventById(userId, eventId);
  	//u.getRelevents().add(e);
  	e.getRelausers().remove(u);
  	service.create(e);
  	service.delete(eventId,userId);
  	return "redirect:/events";
  }
}











