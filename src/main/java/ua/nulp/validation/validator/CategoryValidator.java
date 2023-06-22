package ua.nulp.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import ua.nulp.repository.CategoryRepository;
import ua.nulp.validation.annotation.UniqueCategory;

@Component
public class CategoryValidator implements ConstraintValidator<UniqueCategory, String>{

	 final private CategoryRepository repository;

	public CategoryValidator(CategoryRepository repository) {
		this.repository = repository;
	}

	@Override
	public void initialize(UniqueCategory constraintAnnotation) {
		
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		return !repository.existsByName(arg0);
	}

}

