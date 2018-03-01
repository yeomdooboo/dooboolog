package com.example.dooboolog.interfaces.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("main");
		mav.addObject("projectName", "Dooboo Project");
		return mav;
	}

	@RequestMapping("/about")
	public ModelAndView about() {
		return new ModelAndView("about");
	}
}
