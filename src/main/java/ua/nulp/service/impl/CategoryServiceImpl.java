package ua.nulp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.nulp.entity.Category;
import ua.nulp.repository.CategoryRepository;
import ua.nulp.service.CategoryService;

@Service
public class CategoryServiceImpl extends CrudServiceImpl<Category, Integer> implements CategoryService{

	@Autowired
	public CategoryServiceImpl(CategoryRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

}
