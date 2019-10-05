package com.tutorial.spring.mvc._4Interceptor;

import java.io.IOException;
import java.util.Calendar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws IOException {
		Calendar cal = Calendar.getInstance();
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);// getting the on which request is made
		if (dayOfWeek == 1) {// 1 means Sunday, 2 means Monday,..., 7 means Saturday
			response.getWriter()
					.write("The website is closed on sunday, please try again accessing it on any other week day!!");
			return false;
		}
		return true;
		// if this method returns true then, Application will further handle the request.
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws IOException {
		// This method would be called after Spring MVC executes the request handler method for the request
		System.out.println("HendlerInterceptorAdeptor: Spring MVC called postHandle() method for "
				+ request.getRequestURI().toString());
	}

	public void afterComletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws IOException {
		// This method would be called after the response object is produced by the view request
		System.out.println("HendlerInterceptorAdeptor: Spring MVC called afterComletion() method for "
				+ request.getRequestURI().toString());

	}
}
