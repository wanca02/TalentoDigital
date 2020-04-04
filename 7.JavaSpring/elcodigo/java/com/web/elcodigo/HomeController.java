package com.web.elcodigo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class HomeController {
	@RequestMapping("")
	public String Index() {
		return "login.jsp";
	}

	@RequestMapping(value="login", method=RequestMethod.POST)
	public String login(@RequestParam("code") String code) {
		String rtn;
		if(code.equals("bushido")) rtn= "redirect:/code";
		else rtn="redirect:/authError";
		return rtn;
	}
	
	@RequestMapping("authError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "You must train harder!");
        return "redirect:/";
	}
}
