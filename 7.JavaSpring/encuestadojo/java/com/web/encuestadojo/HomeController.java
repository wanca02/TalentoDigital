package com.web.encuestadojo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class HomeController {
	@RequestMapping("")
	public String Index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="result", method=RequestMethod.POST)
	public String Resultado(Model model,
			@RequestParam("name") String name,
			@RequestParam("location") String location,
			@RequestParam("language") String language,
			@RequestParam("comment") String comment) {
		String rtn;
		if(location.equals("none") || language.equals("none")) rtn="redirect:/authError";
		else {
			model.addAttribute("name",name);
			model.addAttribute("location",location);
			model.addAttribute("language",language);
			model.addAttribute("comment",comment);
			rtn="result.jsp";
		}
		return rtn;
	}
}















