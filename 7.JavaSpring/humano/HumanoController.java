package com.web.humano;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HumanoController {
	@RequestMapping("")
	public String IndexPage(@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname) {
		String txt="Human";
		if(!firstname.equals("") || !lastname.equals("")) txt= firstname+" "+lastname;
		String html="<body>";
		html+="<h1>Hello "+txt+"!</h1>";
		html+="<p>Welcome to SpringBoot</p>";
		html+="</body>";
		return html;
	}
}
