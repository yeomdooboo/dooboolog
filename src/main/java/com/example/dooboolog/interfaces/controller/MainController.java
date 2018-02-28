package com.example.dooboolog.interfaces.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping
	@ResponseBody
	public String index() {
		return "Hello, World!";
	}
}
