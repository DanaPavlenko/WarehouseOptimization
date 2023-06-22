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

import ua.nulp.model.request.CommodityRequest;
import ua.nulp.service.CommodityService;

@SessionAttributes("commodity")
@Controller
@RequestMapping("/worker/commodity")
public class WorkerCommodityController {

	private final CommodityService service;

	@Autowired
	public WorkerCommodityController(CommodityService service) {
		this.service = service;
	}

	@ModelAttribute("commodity")
	public CommodityRequest getForm() {
		return new CommodityRequest();
	}

	@GetMapping
	public String show(Model model) {
		model.addAttribute("categories", service.findAllCategories());
		model.addAttribute("sizes", service.findAllSizes());
		model.addAttribute("commodities", service.findAllViews());
		return "workerCommodity";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		service.delete(id);
		return "redirect:/worker/commodity";
	}

	@PostMapping
	public String save(@ModelAttribute("commodity") @Valid CommodityRequest request, BindingResult br,
			SessionStatus status, Model model) {
		if (br.hasErrors())
			return show(model);
		service.save(request);
		return cancel(status);
	}

	@GetMapping("/update/{id}")
	public String update(@PathVariable Integer id, Model model) {
		model.addAttribute("commodity", service.findOne(id));
		return show(model);
	}

	@GetMapping("/cancel")
	public String cancel(SessionStatus status) {
		status.setComplete();
		return "redirect:/worker/commodity";
	}

}
