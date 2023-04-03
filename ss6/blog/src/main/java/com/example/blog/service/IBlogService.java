package com.example.blog.service;

import com.example.blog.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> getAll();
    Object save(Blog blog);
    Object update(Blog blog);
    void delete(Integer id, Blog blog);
    Blog getBlogById(Integer id);
}
