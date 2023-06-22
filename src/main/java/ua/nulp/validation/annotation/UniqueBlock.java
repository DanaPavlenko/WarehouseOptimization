package ua.nulp.validation.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import ua.nulp.validation.validator.BlockValidator;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy={BlockValidator.class})
public @interface UniqueBlock {
	
	   String message() default "Not unique";
		
		Class<?>[] groups() default {};

	    Class<? extends Payload>[] payload() default {};

}
