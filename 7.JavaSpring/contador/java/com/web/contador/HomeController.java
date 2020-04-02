package com.web.contador;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")

public class HomeController {
	private static Integer cc=0;
	@RequestMapping("counter")
	public String Counter(Model model, HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		//if(bool.equals("ok")) count=0;
		if(!session.isNew()) {
			model.addAttribute("count",count);
		}
		return "counter.jsp";
	}
	
	@RequestMapping("")
	public String Index(HttpSession session) {
		session.setAttribute("count", cc++);
        //Integer count = (Integer) session.getAttribute("count");
		return "index.jsp";
	}
	@RequestMapping("mas2")
	public String Mas2(HttpSession session) {
		session.setAttribute("count", cc+=2);
        //Integer count = (Integer) session.getAttribute("count");
		return "otrapagina.jsp";
	}
}





