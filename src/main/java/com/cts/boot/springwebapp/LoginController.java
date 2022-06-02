package com.cts.boot.springwebapp;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller

public class LoginController {
	
	Logger logger = LoggerFactory.getLogger(LoginController.class);
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String enter(Model model) {
		
		logger.error("error message");
		logger.warn("warn message");
		logger.info("info message");
		logger.debug("debug message");
		logger.trace("trace message");
		
		
		return "loginview";
	}
}
