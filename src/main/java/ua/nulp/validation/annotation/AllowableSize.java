package ua.nulp.validation.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Payload;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Retention(RUNTIME)
@Target(FIELD)
@Min(value=1)
@Max(value=500)
public @interface AllowableSize {
	
   String message() default "Not allowable size";
	
	Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
