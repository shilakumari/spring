package com.tutorial.spring.mvc._5InternationalizationAndLocalization._1Example;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/InternationalizationAndLocalization")
public class InternationalizationAndLocalizationController {
	@RequestMapping(value = "/admissionForm11.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView modelAndView = new ModelAndView("admissionForm11");
		modelAndView.addObject("headerMessage", "Sample Header Message");
		return modelAndView;
	}

	@RequestMapping(value = "/submitAdmissionForm11.html", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView submitAdmissionForm6(@Valid @ModelAttribute("emp") Employee emp, BindingResult bindingReult) {
		if (bindingReult.hasErrors()) {
			System.out.println("Binding errors occured.");
			ModelAndView modelAndView = new ModelAndView("admissionForm11");
			return modelAndView;
		}
		ModelAndView modelAndView = new ModelAndView("submitAdmissionForm11");
		System.out.println("Sample Header Message not present.");
		return modelAndView;
	}

}
