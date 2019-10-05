package com.demo._7WebService._1Introduction;

import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/StudentREST")
public class StudentRESTController {

	@ResponseBody // Here No effect of it
	@RequestMapping("/welcome")
	public ModelAndView controllerMethod() {
		ModelAndView modelAndView = new ModelAndView("helloPage");
		modelAndView.addObject("welcomeMessage", "Hello world!, welcome to the first web-service spring framework");
		modelAndView.addObject("userName", " welcome url");
		return modelAndView;
	}

	@RequestMapping("/welcome2")
	public String controllerMethod2() {
		return "helloPage";
	}

	@ResponseBody
	@RequestMapping("/welcome3")
	public String controllerMethod3() {
		Student student = new Student();
		student.setId(1);
		student.setName("Shalu");

		String jsonString = null;
		try {
			jsonString = new ObjectMapper().writeValueAsString(student);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		System.out.println(student);
		return jsonString;
	}

	@ResponseBody
	@RequestMapping(value = "/welcome4", method = { RequestMethod.GET, RequestMethod.POST })
	public Student controllerMethod4() {
		Student student = new Student();
		student.setId(1);
		student.setName("Shalu");
		return student;
	}

	@ResponseBody
	@RequestMapping("/welcome5")
	public String controllerMethod5() {
		return "welcome5";
	}

	@ResponseBody
	@RequestMapping(value = "/welcome6", method = { RequestMethod.GET, RequestMethod.POST })
	public Student controllerMethod6() {
		Student student = new Student();
		student.setId(1);
		student.setName("Shalu");
		Address address = new Address();
		address.setCity("Jehanabad");
		student.setAddress(address);

		return student;
	}

	@ResponseBody
	@RequestMapping(value = "/students", method = RequestMethod.GET, produces = { "application/json" })
	// @RequestMapping(value = "/students", method =
	// {RequestMethod.GET,RequestMethod.POST},
	// produces=MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Student> getStudentList() {
		ArrayList<Student> studentList = new ArrayList<Student>();

		Student student = new Student();
		student.setId(1);
		student.setName("Shalu");
		Address address = new Address();
		address.setCity("Jehanabad");
		student.setAddress(address);

		Student student2 = new Student();
		student2.setId(1);
		student2.setName("Shalu");

		Student student3 = new Student();
		student3.setId(1);
		student3.setName("Shalu");

		studentList.add(student);
		studentList.add(student2);
		studentList.add(student3);
		return studentList;
	}

	@ResponseBody
	@RequestMapping(value = "/students/{name}", method = { RequestMethod.GET, RequestMethod.POST })
	public Student getStudent(@PathVariable("name") String name) {
		Student student = new Student();
		student.setName(name);
		return student;
	}

	@ResponseBody
	@RequestMapping(value = "/students/{name}", method = { RequestMethod.PUT }, consumes = { "application/json" })
	public boolean updateStudent(@PathVariable("name") String name, @RequestBody Student student) {
		System.out.println(student.getName());
		System.out.println(student.getHobby());
		return true;
	}

	@ResponseBody
	@RequestMapping(value = "/students2/{name2}", method = { RequestMethod.PUT }, consumes = { "application/json" })
	public void updateStudent2(@PathVariable("name2") String name, @RequestBody Student student) {
		System.out.println(student.getName());
		System.out.println(student.getHobby());
		// return true;
	}

	@ResponseBody
	@RequestMapping(value = "/students3/{name3}", method = { RequestMethod.PUT }, consumes = { "application/json" })
	public ResponseEntity<Void> updateStudent3(@PathVariable("name3") String name, @RequestBody Student student) {
		ResponseEntity<Void> responseEntity = new ResponseEntity<Void>(HttpStatus.OK);
		responseEntity = new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		System.out.println(student.getName());
		System.out.println(student.getHobby());
		return responseEntity;
	}

	@ResponseBody
	@RequestMapping(value = "/students4/{name4}", method = { RequestMethod.PUT }, consumes = { "application/json" })
	public ResponseEntity<Student> updateStudent4(@PathVariable("name4") String name, @RequestBody Student student) {
		ResponseEntity<Student> responseEntity = new ResponseEntity<Student>(student, HttpStatus.OK);
		System.out.println(student.getName());
		System.out.println(student.getHobby());
		return responseEntity;
	}

	@ResponseBody
	@RequestMapping(value = "/students5/{name4}", method = { RequestMethod.PUT }, consumes = { "application/json" })
	public ResponseEntity<Student> updateStudent5(@PathVariable("name4") String name, @RequestBody Student student) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("key1", "value1");
		httpHeaders.add("key2", "value2");

		ResponseEntity<Student> responseEntity = new ResponseEntity<Student>(student, httpHeaders, HttpStatus.OK);
		System.out.println(student.getName());
		System.out.println(student.getHobby());
		return responseEntity;
	}

	@ResponseBody
	@RequestMapping(value = "/students", method = { RequestMethod.POST }, consumes = { "application/json" })
	public ResponseEntity<Student> inserStudent(@RequestBody Student student) {
		System.out.println(student.getName());
		System.out.println(student.getHobby());
		// Code to insert student
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("key1", "value1");
		httpHeaders.add("key2", "value2");
		httpHeaders.add("Location_OF_GET_Api_For_Created_Resource", ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{name}").buildAndExpand(student.getName()).toUri().toString());

		ResponseEntity<Student> responseEntity = new ResponseEntity<Student>(student, httpHeaders, HttpStatus.CREATED);
		return responseEntity;
	}

	@ResponseBody
	@RequestMapping(value = "/students/{name}", method = { RequestMethod.DELETE }, consumes = { "application/json" })
	public ResponseEntity<Boolean> deleteStudent(@PathVariable("name") String name) {
		//
		ResponseEntity<Boolean> responseEntity = new ResponseEntity<Boolean>(true, HttpStatus.OK);
		return responseEntity;
	}
}
