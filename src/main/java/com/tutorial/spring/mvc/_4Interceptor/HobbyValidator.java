package com.demo._4Interceptor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {

	private String listOfValidHobbies;

	@Override
	public void initialize(IsValidHobby isValidHobby) {
		this.listOfValidHobbies = isValidHobby.listOfValidHobby();
	}

	@Override
	public boolean isValid(String hobby, ConstraintValidatorContext ctx) {
		// TODO Auto-generated method stub
		if (hobby == null) {
			return false;
		}

		if (hobby.matches(listOfValidHobbies)) {
			return true;
		} else {
			return false;
		}

	}

}
