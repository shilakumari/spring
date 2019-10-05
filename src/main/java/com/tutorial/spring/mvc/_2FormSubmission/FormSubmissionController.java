package com.tutorial.spring.mvc._2FormSubmission;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/form")
public class FormSubmissionController {
	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView modelAndView = new ModelAndView("admissionForm");
		modelAndView.addObject("headerMessage", "Sample Header Message");
		return modelAndView;
	}

	@RequestMapping(value = "/submitAdmissionForm.html", method = { RequestMethod.GET, RequestMethod.GET })
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,
			@RequestParam("studentHobby") String hobby) {
		ModelAndView modelAndView = new ModelAndView("submitAdmissionForm");
		modelAndView.addObject("headerMessage", "Sample Header Message");
		modelAndView.addObject("abc",
				"student Name:" + name + "  student Hobby:   " + hobby + " (by submitAdmissionForm.html url)");
		return modelAndView;
	}

	@RequestMapping(value = "/submitAdmissionForm2.html", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView submitAdmissionForm2(@RequestParam(value = "studentName", defaultValue = "Guest") String name,
			@RequestParam("studentHobby") String hobby) {
		ModelAndView modelAndView = new ModelAndView("submitAdmissionForm");
		modelAndView.addObject("headerMessage", "Sample Header Message");
		modelAndView.addObject("abc", "Name:" + name + "  \nHobby:   " + hobby + " (by submitAdmissionForm2.html url)");
		return modelAndView;
	}

	@RequestMapping(value = "/submitAdmissionForm3.html", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView submitAdmissionForm3(@RequestParam Map<String, String> requestParam) {
		String hobby = requestParam.get("studentHobby");
		String name = requestParam.get("studentName");
		ModelAndView modelAndView = new ModelAndView("submitAdmissionForm");
		// modelAndView.addObject("headerMessage","Sample Header Message");
		modelAndView.addObject("abc", "Name:" + name + "  \nHobby:   " + hobby + " (by submitAdmissionForm3.html url)");
		return modelAndView;
	}

	@RequestMapping(value = "/submitAdmissionForm4.html", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView submitAdmissionForm4(@RequestParam(value = "studentName", defaultValue = "Guest") String name,
			@RequestParam("studentHobby") String hobby) {
		Student student = new Student();
		student.setStudentName(name);
		student.setStudentHobby(hobby);
		ModelAndView modelAndView = new ModelAndView("submitAdmissionForm4");
		modelAndView.addObject("headerMessage", "Sample Header Message");
		modelAndView.addObject("abc", "(Using submitAdmissionForm4.html url)");
		modelAndView.addObject("st", student);
		return modelAndView;
	}

	// Using @ModelAttribute("") annotation as method argument
	@RequestMapping(value = "/submitAdmissionForm5.html", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView submitAdmissionForm5(@ModelAttribute("st") Student st2) {
		ModelAndView modelAndView = new ModelAndView("submitAdmissionForm4");
		modelAndView.addObject("abc", "(Using submitAdmissionForm5.html url)");
		System.out.println("Sample Header Message not present.");
		return modelAndView;
	}

	// Using @ModelAttribute annotation on top of the method()
	@ModelAttribute
	public void demoModelAttribute() {
		System.out.println(
				" @ModelAttribute annotaion 1: I will be called before any request handler method of this controller.");
	}

	@ModelAttribute
	public void demoModelAttribute2(Model m) {
		System.out.println(
				"@ModelAttribute annotaion 2: I will be called before any request handler method of this controller.");
		m.addAttribute("headerMessage", "Sample Header Message from demoModelAttribute2");
	}

	@RequestMapping(value = "/submitAdmissionForm6.html", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView submitAdmissionForm6(@ModelAttribute("emp") Employee emp, BindingResult bindingReult) {
		if (bindingReult.hasErrors()) {
			System.out.println("Binding errors occured.");
			ModelAndView modelAndView = new ModelAndView("admissionForm");
			return modelAndView;
		}
		ModelAndView modelAndView = new ModelAndView("submitAdmissionForm6");
		System.out.println(
				"Sample Header Message not present, because of @ModelAttribute annotaion on top of another method that have included headerMessage");
		return modelAndView;
	}

	// PropertyEditors classes for typing conversion during data binding task:
	// FileEditor, ClassEditor, CustomeDateEditor, CustomNumberEditor,
	// CustomBooleanEditor
	@InitBinder
	public void initBinderAbc(WebDataBinder binder) {
		System.out.println("@InitBinder called after @ModelAttribute");
		System.out.println("Mobile number must be integer");
		binder.setDisallowedFields(new String[] { "mobile" });
		binder.registerCustomEditor(Date.class, "dob",
				new CustomDateEditor((new SimpleDateFormat("yyyy****MM****dd")), false));//false means empty is allowed
		binder.registerCustomEditor(String.class, "name", new StudentNameEditor());
	}
}
