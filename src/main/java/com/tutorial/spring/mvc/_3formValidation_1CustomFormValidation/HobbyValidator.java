package com.demo._3formValidation_1CustomFormValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {

	@Override
	public void initialize(IsValidHobby isValidHobby) {
	}

	@Override
	public boolean isValid(String hobby, ConstraintValidatorContext ctx) {
		// TODO Auto-generated method stub
		if (hobby == null) {
			return false;
		}

		if (hobby.matches("Music|Football|Cricket|Hockey")) {
			return true;
		} else {
			return false;
		}
	}
}
