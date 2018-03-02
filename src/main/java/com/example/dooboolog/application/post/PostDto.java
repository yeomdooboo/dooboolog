package com.example.dooboolog.application.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
	private int postId;
	private int categoryId;
	private String title;
	private String content;
}
