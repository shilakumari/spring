package com.tutorial.spring.mvc._6ExceptionHandling.example1;

import java.io.IOException;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ExceptionHandlingController")
public class ExceptionHandlingController {
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

	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Exception e) {
		// logging Null Pointer Exception
		System.out.println("NullPointerException occured: " + e);
		return "nullPointerException";
	}

	@ExceptionHandler(value = IOException.class)
	public String handleIOException(Exception e) {
		// logging IO Exception
		System.out.println("NullPointerException occured: " + e);
		return "ioException";
	}

	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception e) {
		// logging IO Exception
		System.out.println("Unknown Exception occured: " + e);
		return "exception";
	}
}
