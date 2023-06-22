package ua.nulp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping(value = "/")
	public String showIndex(Model model) {
		model.addAttribute("message", "rrr");
		return "index";
	}

	@GetMapping(value = "/admin")
	public String showAdmin() {
		return "admin";
	}

	@GetMapping(value = "/worker")
	public String showWorker() {
		return "worker";
	}

}
