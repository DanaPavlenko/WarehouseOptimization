package ua.nulp.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import ua.nulp.validation.annotation.UniqueSize;

public class SizeValidator implements 	ConstraintValidator<UniqueSize, String>{

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		return false;
	}
	
	

}
