package com.example.dooboolog.interfaces.controller;

import com.example.dooboolog.application.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/post")
@Controller
public class PostController {
	@Autowired
	PostService postService;

	@RequestMapping("/list")
	public ModelAndView postList() {
		ModelAndView mav = new ModelAndView("post/list");
		postService.addEssentialDataModelAndView(mav);
		return mav;
	}

	@RequestMapping("/add")
	@ResponseBody
	public String addPost() {
		return postService.addPosts();
	}

	@RequestMapping("/new")
	public String newPost() {
		return "/post/postForm";
	}
}
