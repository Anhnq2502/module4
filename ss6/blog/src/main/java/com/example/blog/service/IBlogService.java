package com.example.blog.service;

import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IBlogService {
    Page<Blog> getAll(PageRequest pageRequest);

    Object save(Blog blog);

    Object update(Blog blog);

    void delete(Integer id, Blog blog);

    Blog getBlogById(Integer id);
    List<Blog> FindByTitle(String title,PageRequest pageRequest);
    List<Blog> FindByCategory(String category,PageRequest pageRequest);
}
