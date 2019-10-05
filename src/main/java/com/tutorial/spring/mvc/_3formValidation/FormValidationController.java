package com.tutorial.spring.mvc._3formValidation;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/formValidations")
public class FormValidationController {
	@RequestMapping(value = "/admissionForm2.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView modelAndView = new ModelAndView("admissionForm");
		modelAndView.addObject("headerMessage", "Sample Header Message");
		return modelAndView;
	}

	@RequestMapping(value = "/submitAdmissionForm7.html", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView submitAdmissionForm6(@Valid @ModelAttribute("emp") Employee emp, BindingResult bindingReult) {
		if (bindingReult.hasErrors()) {
			System.out.println("Binding errors occured.");
			ModelAndView modelAndView = new ModelAndView("admissionForm");
			return modelAndView;
		}
		ModelAndView modelAndView = new ModelAndView("submitAdmissionForm7");
		System.out.println("Sample Header Message not present.");
		return modelAndView;
	}

}
