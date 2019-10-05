package com.demo._2FormSubmission;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {

	// When you will submit the admission form, Spring MVC will use setAsText
	// function of this class. Before performing data binding task for name
	// property of student object.
	@Override
	public void setAsText(String name)// throws IllegalArgumentException
	{
		if (!(name.contains("Mr.") || name.contains("Ms."))) {
			name = "Ms. " + name;
		}
		setValue(name);// Whatever value you will provide to setValue...Spring
						// MVC will use the same value to perform data binding
						// task for name property.
	}
}
 