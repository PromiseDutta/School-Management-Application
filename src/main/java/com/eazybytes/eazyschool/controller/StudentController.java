package com.eazybytes.eazyschool.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eazybytes.eazyschool.model.Person;
import com.eazybytes.eazyschool.repository.CoursesRepository;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j

@Controller
@RequestMapping("student")
public class StudentController {

	
@GetMapping("/displayCourses")
	public ModelAndView displayCourses(Model model, HttpSession session) {

		ModelAndView modelAndView = new ModelAndView("courses_enrolled.html");
		Person person = (Person) session.getAttribute("loggedInPerson");
		modelAndView.addObject("person", person);
		return modelAndView;
	}

}
