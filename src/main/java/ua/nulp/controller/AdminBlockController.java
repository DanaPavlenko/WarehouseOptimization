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

import ua.nulp.model.request.BlockRequest;
import ua.nulp.service.BlockService;

@Controller
@RequestMapping("/admin/block")
@SessionAttributes("block")
public class AdminBlockController {

	private final BlockService service;

	@Autowired
	public AdminBlockController(BlockService service) {
		this.service = service;
	}

	@ModelAttribute("block")
	public BlockRequest getForm() {
		return new BlockRequest();
	}

	@GetMapping
	public String show(Model model) {
		model.addAttribute("commodities", service.findAllCommodities());
		model.addAttribute("zones", service.findAllZones());
		model.addAttribute("sizes", service.findAllSizes());
		model.addAttribute("blocks", service.findAllViews());
		return "block";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		service.delete(id);
		return "redirect:/admin/block";
	}

	@PostMapping
	public String save(@ModelAttribute("block") @Valid BlockRequest request, BindingResult br, SessionStatus status,
			Model model) {
		if (br.hasErrors())
			return show(model);
		service.save(request);
		return cancel(status);
	}

	@GetMapping("/update/{id}")
	public String update(@PathVariable Integer id, Model model) {
		model.addAttribute("block", service.findOne(id));
		return show(model);
	}

	@GetMapping("/cancel")
	public String cancel(SessionStatus status) {
		status.setComplete();
		return "redirect:/admin/block";
	}
}
