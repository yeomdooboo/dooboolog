package com.example.dooboolog.interfaces.controller;

import com.example.dooboolog.application.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostController {
	@Autowired
	PostService postService;

	@RequestMapping("/post/list")
	public ModelAndView postList() {
		ModelAndView mav = new ModelAndView("post/list");
		postService.addEssentialDataModelAndView(mav);
		return mav;
	}
}
