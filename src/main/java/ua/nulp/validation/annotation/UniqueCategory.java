package ua.nulp.validation.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import ua.nulp.validation.validator.CategoryValidator;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = {CategoryValidator.class})
public @interface UniqueCategory {
	
    String message() default "Not unique";
	
	Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}

