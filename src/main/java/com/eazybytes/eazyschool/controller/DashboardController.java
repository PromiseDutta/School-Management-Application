package com.eazybytes.eazyschool.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eazybytes.eazyschool.model.Person;
import com.eazybytes.eazyschool.repository.PersonRepository;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@Slf4j
@Controller
public class DashboardController {
	@Autowired
	PersonRepository personRepository;

    @RequestMapping("/dashboard")
    public String displayDashboard(Model model,Authentication authentication,HttpSession session) {
    	
    	Person person=personRepository.readByEmail(authentication.getName());
        model.addAttribute("username", person.getName());
        model.addAttribute("roles", authentication.getAuthorities().toString());
        
        
        session.setAttribute("loggedInPerson", person);
        //throw new RuntimeException("It's been a bad day!!");
       return "dashboard.html";
    }

}