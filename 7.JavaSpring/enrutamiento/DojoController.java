package com.web.enrutamiento;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DojoController {
	@RequestMapping("{route}")
    public String showLesson(@PathVariable("route") String route){
		String txt="";
		if("dojo".equals(route)) txt= "¡El Dojo es increíble!";
		else if("burbank-dojo".equals(route)) txt= "El Dojo Burbank está localizado al sur de California";
		else if("san-jose".equals(route)) txt= "El Dojo SJ es el cuartel general";
		else txt= "Ésta página no existe";
    	return txt;
    }
}
