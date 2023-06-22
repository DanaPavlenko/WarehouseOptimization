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

import ua.nulp.model.request.SizeRequest;
import ua.nulp.service.SizeService;

@SessionAttributes("size")
@Controller
@RequestMapping("/admin/size")
public class AdminSizeController {

	private final SizeService service;

	@Autowired
	public AdminSizeController(SizeService service) {
		this.service = service;
	}

	@ModelAttribute("size")
	public SizeRequest getForm() {
		return new SizeRequest();
	}

	@GetMapping
	public String show(Model model) {
		model.addAttribute("sizes", service.findAllSizes());
		return "size";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		service.delete(id);
		return "redirect:/admin/size";
	}

	@PostMapping
	public String save(@ModelAttribute("size") @Valid SizeRequest request, BindingResult br, SessionStatus status,
			Model model) {
		if (br.hasErrors())
			return show(model);
		service.save(request);
		return cancel(status);
	}

	@GetMapping("/update/{id}")
	public String update(@PathVariable Integer id, Model model) {
		model.addAttribute("size", service.findOne(id));
		return show(model);
	}

	@GetMapping("/cancel")
	public String cancel(SessionStatus status) {
		status.setComplete();
		return "redirect:/admin/size";
	}

}
