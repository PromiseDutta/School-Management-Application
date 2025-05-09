package com.eazybytes.eazyschool.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class GlobalExceptionController {

	@ExceptionHandler(Exception.class)
	public ModelAndView exceptionHandler(Exception exception) {
		ModelAndView errorpage=new ModelAndView();
		errorpage.setViewName("error");
		errorpage.addObject("errormsg",exception.getMessage());
		
		return errorpage;
	}
}
