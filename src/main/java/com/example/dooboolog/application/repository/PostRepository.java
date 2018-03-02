package com.example.dooboolog.application.repository;

import com.example.dooboolog.application.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository  extends JpaRepository<Post, Integer> {
}
