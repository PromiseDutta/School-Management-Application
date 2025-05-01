package com.eazybytes.eazyschool.annotation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.eazybytes.eazyschool.validations.PasswordStrengthValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = PasswordStrengthValidator.class)
@Target({ METHOD, FIELD })
@Retention(RetentionPolicy.RUNTIME)

public @interface PasswordValidator {

	String message() default "Please choose a strong password";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
