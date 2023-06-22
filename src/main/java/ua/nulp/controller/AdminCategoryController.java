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

import ua.nulp.entity.Category;
import ua.nulp.service.CategoryService;

@Controller
@RequestMapping(path = "/admin/category")
@SessionAttributes("category")
public class AdminCategoryController {

	private final CategoryService service;

	@Autowired
	public AdminCategoryController(CategoryService service) {
		this.service = service;
	}

	@ModelAttribute("category")
	public Category getForm() {
		return new Category();
	}

	@GetMapping
	public String show(Model model) {
		model.addAttribute("categories", service.findAll());
		return "category";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		service.delete(id);
		return "redirect:/admin/category";
	}

	@PostMapping
	public String save(@ModelAttribute("category") @Valid Category category, BindingResult br, SessionStatus status,
			Model model) {
		if (br.hasErrors())
			return show(model);
		service.save(category);
		return cancel(status);
	}

	@GetMapping("/update/{id}")
	public String update(@PathVariable Integer id, Model model) {
		model.addAttribute("category", service.find(id));
		return show(model);
	}

	@GetMapping("/cancel")
	public String cancel(SessionStatus status) {
		status.setComplete();
		return "redirect:/admin/category";
	}

}