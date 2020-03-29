package com.web.enrutamiento;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("coding")
public class CodingController {
	
	@RequestMapping("")
	public String IndexPage() {
		return "¡Hola Coding Dojo!";
	}
	
	@RequestMapping("python")
	public String PythonPage() {
		return "¡Python/Django fue increíble!";
	}
	
	@RequestMapping("java")
	public String JavaPage() {
		return "¡Java/Spring es mejor!";
	}
}











