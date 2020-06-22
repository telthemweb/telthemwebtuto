package com.inno.sagehill.api;

import com.inno.sagehill.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRespository extends JpaRepository<Blog, Integer> {
    // custom query to search to blog post by title or content
    List<Blog> findByTitleContainingOrDescriptionContaining(String text, String textAgain);


}
