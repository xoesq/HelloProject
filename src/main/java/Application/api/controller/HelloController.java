package Application.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String showHello(Model model){
		model.addAttribute("saludo", "Mi primera aplicacion web Spring Boot");
		return "hello";
	}
}