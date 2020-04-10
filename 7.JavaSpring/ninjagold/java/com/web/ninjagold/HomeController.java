package com.web.ninjagold;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {
	private static int gold=0;
	private static String history="Welcome to the game\n";
	
	@RequestMapping("Gold")
	public String Gold(Model model) {
		model.addAttribute("gold",gold);
		model.addAttribute("history",history);
		return "gold.jsp";
	}
	
	@RequestMapping(value="calculate", method=RequestMethod.POST)
	public String Calculate(@RequestParam(value="place") String Param) {
		int earn=0; String _bool="earned", ouch="";
		if(Param.equals("farm")) {
			earn=(int) Math.floor(Math.random()*10)+10;
		}
		else if(Param.equals("cave")) {
			earn=(int) Math.floor(Math.random()*5)+5;
		}
		else if(Param.equals("house")) {
			earn=(int) Math.floor(Math.random()*3)+2;
		}
		else {
			int azar;
			if(Math.random()<0.6) {
				azar=-1; _bool="lost"; ouch="Ouch";
			}
			else azar=1;
			earn=(int) (Math.floor(Math.random()*50))*azar;
		}
		SimpleDateFormat sdfDate = new SimpleDateFormat("E, dd MMMM yyyy HH:mm");
		java.util.Date now = new java.util.Date();
	  String d = sdfDate.format(now);
		gold+=earn;
		history+="You entered a "+Param+" and "+_bool+" "+earn+" gold. "+ouch+" ("+d+")\n";
		return "redirect:/Gold";
	}
}



















