package com.tutorial.spring.mvc._1FirstMVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView("helloPage");
		modelAndView.addObject("welcomeMessage", "Hello world!, welcome to the first spring MVC framework");
		modelAndView.addObject("userName", " ModelAndView ");

		return modelAndView;
	}

}
