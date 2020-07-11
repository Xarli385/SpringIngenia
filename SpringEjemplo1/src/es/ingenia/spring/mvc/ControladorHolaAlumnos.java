package es.ingenia.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

	@RequestMapping("/procesarFormulario2")
	public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
		
		String nombre=request.getParameter("nombreAlumno");
				
		nombre+= " es el ganador de la loteria.";
				
		String mensajeFinal="¿Quién ha ganado la loteria?" + nombre;
		
		modelo.addAttribute("mensajeCompleto", mensajeFinal);
		
		return "ResultadoSpring";
		
	}
}

	