package ua.nulp.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import ua.nulp.entity.Category;
import ua.nulp.repository.CategoryRepository;

@Component
public class CategoryConverter implements Converter<String, Category>{

	private final CategoryRepository repository;
	
	
	public CategoryConverter(CategoryRepository repository) {
		this.repository = repository;
	}


	@Override
	public Category convert(String name) {
		return repository.findByName(name);
	}

}
