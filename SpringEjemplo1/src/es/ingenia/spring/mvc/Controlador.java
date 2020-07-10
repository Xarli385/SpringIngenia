package es.ingenia.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
	
	@RequestMapping
	public String MuestraPagina (){
		
		return "PaginaEjemplo";
	}

}
