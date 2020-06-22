package com.web.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.lookify.models.Lookify;
import com.web.lookify.services.LookifyService;

@Controller
@RequestMapping("/")
public class LookifyController {
	private final LookifyService service;
	public LookifyController(LookifyService service) {
		this.service=service;
	}
	
	@RequestMapping("")
	public String Index() {
		return "index.jsp";
	}
	
	@RequestMapping("dashboard")
	public String Dashboard(Model model) {
		List<Lookify> songs=service.showall();
		model.addAttribute("songs", songs);
		return "dashboard.jsp";
	}
	
	@RequestMapping("songs/new")
	public String New(Model model, @ModelAttribute("song") Lookify song) {
		model.addAttribute("song", song);
		return "new.jsp";
	}
	@RequestMapping(value="songs/add", method=RequestMethod.POST)
	public String add(@Valid @ModelAttribute("song") Lookify song) {
		service.create(song);
		return "redirect:/dashboard";
	}
	
	@RequestMapping("songs/{id}")
	public String Show(Model model, @PathVariable("id") Long id) {
		Lookify _song= service.findid(id);
		model.addAttribute("song",_song);
		return "show.jsp";
	}
	
	@RequestMapping(value="search", method=RequestMethod.GET)
	public String search(Model model, @Valid @RequestParam(value="search") String search) {
		List<Lookify> songs=service.findsongs(search);
		model.addAttribute("songs", songs);
		return "search.jsp";
	}
	
	@RequestMapping("search/topTen")
	public String Top(Model model) {
		List<Lookify> songs=service.findtop(10);
		model.addAttribute("songs", songs);
		return "top.jsp";
	}
	
	@RequestMapping(value="del", method=RequestMethod.DELETE)
	public String delete(@Valid @RequestParam(value="id") Long id) {
		service.delete(id);
		return "redirect:/dashboard";
	}
}









