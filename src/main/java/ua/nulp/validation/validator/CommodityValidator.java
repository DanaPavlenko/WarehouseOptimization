package ua.nulp.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import ua.nulp.repository.CommodityRepository;
import ua.nulp.validation.annotation.UniqueCommodity;

@Component
public class CommodityValidator implements ConstraintValidator<UniqueCommodity, String>{
	
	private CommodityRepository repository;

	public CommodityValidator(CommodityRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		return !repository.existsByName(arg0);
	}

}
