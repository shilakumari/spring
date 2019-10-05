package com.tutorial.spring.mvc._3formValidation_2CustomFormValidation;

import java.lang.annotation.Documented;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

//import org.springframework.messaging.handler.annotation.Payload;

@Documented
@Constraint(validatedBy = { HobbyValidator.class })
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {
	//To set the default value for the @IsValidHobby annotation argument using "default" 
	String listOfValidHobby() default "Music|Football|Cricket|Hockey";
	//String listOfValidHobby();

	String message() default "Please provide a valid hobby"
			+ "accepted hobbies are - Music, football, Cricket and Hockey (choose anyone) ";

	Class<?>[] groups() default {};

	Class<? extends javax.validation.Payload>[] payload() default {};
}
