package com.eazybytes.eazyschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eazybytes.eazyschool.model.Person;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("public")
public class PublicController {

	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String displayRegisterPage(Model model) {
		model.addAttribute("person", new Person());  //By adding new Person() to the model with the key "person", you provide an empty object for the form to bind to. When the user fills out the form and submits it, Spring will populate this object with the submitted data.
		return "register.html";
	}
	
	
	@RequestMapping(value="/createUser", method= {RequestMethod.POST})
	public String createUser(@Valid @ModelAttribute("person")Person person,Errors errors) {
		 if(errors.hasErrors()){
	            return "register.html";
	        }
		 else
	            return "redirect:/login?register=true";
	       
	    }
	}
	
	
	


