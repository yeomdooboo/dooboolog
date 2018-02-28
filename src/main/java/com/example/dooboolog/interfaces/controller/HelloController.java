package com.example.dooboolog.interfaces.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("projectName", "Dooboo Project");
		return mav;
	}
}

