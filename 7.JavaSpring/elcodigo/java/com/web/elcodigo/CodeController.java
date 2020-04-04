package com.web.elcodigo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CodeController {
	@RequestMapping("code")
	public String Code(){
		return "code.jsp";
	}
}
