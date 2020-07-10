package es.ingenia.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorHolaAlumnos {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(){
		
		return "FormularioMuestra";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "ResultadoSpring";		
	}

}

	