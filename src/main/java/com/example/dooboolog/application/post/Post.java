package com.example.dooboolog.application.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {
	@Id
	@GeneratedValue
	private int postId;
	private int categoryId;
	private String title;
	private String content;
}
