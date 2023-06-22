package ua.nulp.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import ua.nulp.repository.ZoneRepository;
import ua.nulp.validation.annotation.UniqueZone;

@Component
public class ZoneValidator implements ConstraintValidator<UniqueZone, String>{
	
	private final ZoneRepository repository;

	public ZoneValidator(ZoneRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public void initialize(UniqueZone constraintAnnotation) {
		
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		return !repository.existsByName(arg0);
	}
	
	

}
