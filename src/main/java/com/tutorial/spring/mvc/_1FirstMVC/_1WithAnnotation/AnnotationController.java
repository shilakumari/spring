package com.demo._1FirstMVC._1WithAnnotation;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet2")
public class AnnotationController {
	// requestHandlerMethod
	@RequestMapping("/welcome2") // welcome.xyz
	public ModelAndView controllerMethod() {
		ModelAndView modelAndView = new ModelAndView("helloPage");
		modelAndView.addObject("welcomeMessage", "Hello world!, welcome to the first spring framework");
		modelAndView.addObject("userName", " welcome 2 ");
		return modelAndView;
	}

	@RequestMapping("/hi")
	public ModelAndView controllerMethodHi() {
		ModelAndView modelAndView = new ModelAndView("helloPage");
		modelAndView.addObject("welcomeMessage", "Hello world!, welcome to the first spring framework");
		modelAndView.addObject("userName", " Hi ");
		return modelAndView;
	}

	// we can change the "user" value using @PathVariable("user") annotation
	@RequestMapping("/welcome3/country/{user}")
	public ModelAndView controllerMethodUser(@PathVariable("user") String userName) {
		ModelAndView modelAndView = new ModelAndView("helloPage");
		modelAndView.addObject("welcomeMessage", "Hello world!, welcome to the first spring framework");
		modelAndView.addObject("userName", " welcome 3/country/{user}  and user value from the URL:  " + userName);
		return modelAndView;
	}

	@RequestMapping("/welcome4/{country2}/{user}")
	public ModelAndView controllerMethodUser2(@PathVariable("user") String userName,
			@PathVariable("country2") String countryName) {
		ModelAndView modelAndView = new ModelAndView("helloPage");
		modelAndView.addObject("welcomeMessage", "Hello world!, welcome to the first spring framework");
		modelAndView.addObject("userName", " welcome 4/{country2}/{user},  user value from the URL:  " + userName
				+ "    and user country from the URL:   " + countryName);
		return modelAndView;
	}

	// For "Map<String,String>",Add "<mvc:annotation-driven />" to
	// the"dispatcher.xml"
	@RequestMapping("/welcome5/{countryName}/{userName}")
	public ModelAndView controllerMethodUser3(@PathVariable Map<String, String> pathVar) {
		String user = pathVar.get("userName");
		String country = pathVar.get("countryName");
		ModelAndView modelAndView = new ModelAndView("helloPage");
		modelAndView.addObject("welcomeMessage", "Hello world!, welcome to the first spring framework");
		modelAndView.addObject("userName",
				" welcome5/{countryName}/{userName},  user name:   " + user + " and user country:   " + country);
		return modelAndView;
	}
}
