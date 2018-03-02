package com.example.dooboolog.application.post;

import com.example.dooboolog.application.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
	@Autowired
	PostRepository postRepository;

	public void addEssentialDataModelAndView(ModelAndView mav) {
		mav.addObject("posts", findPosts());
		mav.addObject("categories", getCategoryDtos());
	}

	private List<Post> getPostList() {
		List<Post> postDtos = new ArrayList<>();
		postDtos.add(new Post(1, 1, "제목", "내용임 ㅋㅋㅋ"));
		postDtos.add(new Post(1, 1, "두번째 글", "두부로그 꼭 완성시키자"));
		postDtos.add(new Post(1, 1, "세번째 글", "나중엔 막 에디터도 넣고 그러자~"));
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

	public String addPosts() {
		Post postDto1 = new Post();
		postDto1.setTitle("제목");
		postDto1.setContent("내용임ㅋㅋ");
		Post postDto2 = new Post();
		postDto2.setTitle("두번째 글");
		postDto2.setContent("두부로그 꼭 완성시키자");
		Post postDto3 = new Post();
		postDto3.setTitle("세번째 글");
		postDto3.setContent("나중엔 막 에디터도 넣고 그러자~");
		try {
			postRepository.save(postDto1);
			postRepository.save(postDto2);
			postRepository.save(postDto3);
		}catch (Exception e) {
			return "Fail..";
		}
		return "success";
 	}

 	private List<Post> findPosts() {
		return postRepository.findAll();
	}
}
