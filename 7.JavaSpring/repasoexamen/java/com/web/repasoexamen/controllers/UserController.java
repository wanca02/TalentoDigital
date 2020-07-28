package com.web.repasoexamen.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.repasoexamen.models.User;
import com.web.repasoexamen.services.MainService;


@Controller
public class UserController {
    private final MainService service;
    
    public UserController(MainService service) {
        this.service = service;
    }
    
    @RequestMapping("/")
    public String registerForm(@ModelAttribute("user") User user) {
      return "index.jsp";
    }
    
    @RequestMapping(value="/addUser", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
	    if(result.hasErrors()) return "redirect:/";
    	User u = service.registerUser(user);
    	session.setAttribute("userId", u.getId());
    	return "redirect:/";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
     	boolean isAuthenticated = service.authenticateUser(email, password);
    	if(isAuthenticated) {
    		User u = service.findByEmail(email);
    		session.setAttribute("userId", u.getId());
    		return "redirect:/events";
    	} else {
    		model.addAttribute("error", "Invalid Credentials. Try again");
      	return "index.jsp";
    	}
    }
    
    
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "redirect:/";
    }
}
