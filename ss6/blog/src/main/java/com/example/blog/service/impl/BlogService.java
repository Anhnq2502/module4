package com.example.blog.service.impl;

import com.example.blog.model.Blog;
import com.example.blog.repository.IBlogRepository;
import com.example.blog.service.IBlogService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    private final
    IBlogRepository iBlogRepository;

    public BlogService(IBlogRepository iBlogRepository) {
        this.iBlogRepository = iBlogRepository;
    }

    @Override
    public Page<Blog> getAll(PageRequest pageRequest) {
        return  iBlogRepository.findAll(pageRequest);
    }

    @Override
    public Object save(Blog blog) {
        this.iBlogRepository.save(blog);
        return null;
    }

    @Override
    public Object update(Blog blog) {
        this.iBlogRepository.save(blog);
        return null;
    }

    @Override
    public void delete(Integer id, Blog blog) {
        this.iBlogRepository.delete(blog);
    }

    @Override
    public Blog getBlogById(Integer id) {
        return iBlogRepository.findById(id).get();
    }

    @Override
    public List<Blog> FindByTitle(String title,PageRequest pageRequest) {
        return iBlogRepository.findAllByTitle(title,pageRequest);
    }

    @Override
    public List<Blog> FindByCategory(String category, PageRequest pageRequest) {
        return iBlogRepository.findByCategory(category,pageRequest);
    }

}
