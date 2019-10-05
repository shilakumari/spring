package com.demo._6ExceptionHandling.example2;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ExceptionHandlingController2")
public class ExceptionHandlingController2 {
	@RequestMapping(value = "/admissionForm14.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() throws Exception {
		String exceptionOccured = "ARITHMETIC_EXCEPTION";
		if (exceptionOccured.equalsIgnoreCase("NULL_POINTER")) {
			throw new NullPointerException("Null Pointer Exception");
		} else if (exceptionOccured.equalsIgnoreCase("IO_EXCEPTION")) {
			throw new IOException("IO Exception");
		} else if (exceptionOccured.equalsIgnoreCase("ARITHMETIC_EXCEPTION")) {
			throw new ArithmeticException("Arithmetic Exception");
		}

		ModelAndView modelAndView = new ModelAndView("admissionForm14");
		modelAndView.addObject("headerMessage", "Sample Header Message");
		return modelAndView;
	}

	@RequestMapping(value = "/submitAdmissionForm14.html", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView submitAdmissionForm6(@Valid @ModelAttribute("emp") Employee emp, BindingResult bindingReult) {
		if (bindingReult.hasErrors()) {
			System.out.println("Binding errors occured.");
			ModelAndView modelAndView = new ModelAndView("admissionForm14");
			return modelAndView;
		}
		ModelAndView modelAndView = new ModelAndView("submitAdmissionForm14");
		System.out.println("Sample Header Message not present.");
		return modelAndView;
	}

}
