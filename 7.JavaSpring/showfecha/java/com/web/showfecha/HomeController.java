package com.web.showfecha;

import java.text.SimpleDateFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	@RequestMapping("")
	public String Index() {
		return "index.jsp";
	}
	
	@RequestMapping("date")
	public String Date(Model model) {
		String date=DateTime("E, dd MMMM yyyy");
		model.addAttribute("date",date);
		return "date.jsp";
	}
	
	@RequestMapping("time")
	public String Time(Model model) {
		String time=DateTime("HH:mm:ss");
		model.addAttribute("time",time);
		return "time.jsp";
	}
	
	public String DateTime(String x) {
		SimpleDateFormat sdfDate = new SimpleDateFormat(x);
		java.util.Date now = new java.util.Date();
	    String d = sdfDate.format(now);
	    return d;
	}
}







