package ru.fbtw.matrix_portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class MainController {

	@GetMapping("/")
	public String mainPage(Map<String, Object> model){
		return "grettings";
	}

	@GetMapping("/home")
	public String home(Map<String, Object> model){
		return "home";
	}
}
