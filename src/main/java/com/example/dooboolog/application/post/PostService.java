package com.example.dooboolog.application.post;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
	public void addEssentialDataModelAndView(ModelAndView mav) {
		mav.addObject("posts", getPostList(1));
		mav.addObject("categories", getCategoryDtos());
	}

	private List<PostDto> getPostList(int cateogryId) {
		List<PostDto> postDtos = new ArrayList<>();
		postDtos.add(new PostDto(1, 1, "제목", "내용임 ㅋㅋㅋ"));
		return postDtos;
	}

	private List<CategoryDto> getCategoryDtos() {
		List<CategoryDto> categoryDtos = new ArrayList<>();
		categoryDtos.add(new CategoryDto(1, "spring"));
		categoryDtos.add(new CategoryDto(2, "java"));
		categoryDtos.add(new CategoryDto(3, "react"));
		categoryDtos.add(new CategoryDto(4, "javascript"));
		categoryDtos.add(new CategoryDto(4, "jpa"));
		return categoryDtos;
	}
}
