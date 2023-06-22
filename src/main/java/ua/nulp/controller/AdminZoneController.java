package ua.nulp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.nulp.entity.Zone;
import ua.nulp.service.ZoneService;

@SessionAttributes("zone")
@Controller
@RequestMapping(path = "/admin/zone")
public class AdminZoneController {

	private final ZoneService service;

	@Autowired
	public AdminZoneController(ZoneService service) {
		this.service = service;
	}

	@GetMapping
	public String show(Model model) {
		model.addAttribute("zones", service.findAll());
		return "zone";
	}

	@ModelAttribute("zone")
	public Zone getForm() {
		return new Zone();
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		service.delete(id);
		return "redirect:/admin/zone";
	}

	@PostMapping
	public String save(@ModelAttribute("zone") @Valid Zone zone, BindingResult br, SessionStatus status, Model model) {
		if (br.hasErrors())
			return show(model);
		service.save(zone);
		return cancel(status);
	}

	@GetMapping("/update/{id}")
	public String update(@PathVariable Integer id, Model model) {
		model.addAttribute("zone", service.find(id));
		return show(model);
	}

	@GetMapping("/cancel")
	public String cancel(SessionStatus status) {
		status.setComplete();
		return "redirect:/admin/zone";
	}

}
