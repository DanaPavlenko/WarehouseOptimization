package ua.nulp.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import ua.nulp.repository.BlockRepository;
import ua.nulp.validation.annotation.UniqueBlock;

@Component
public class BlockValidator implements ConstraintValidator<UniqueBlock, String>{
	
	private final BlockRepository repository;
	
	public BlockValidator(BlockRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
	
		return !repository.existsByName(arg0);
	}
	
	

}
