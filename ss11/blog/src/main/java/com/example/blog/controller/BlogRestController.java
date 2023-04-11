package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.blog.IBlogService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BlogRestController {
    private final IBlogService blogService;

    public BlogRestController(IBlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("")
    public ResponseEntity<Page<Blog>> findAllBlog(
            @RequestParam(required = false, defaultValue = "") String nameSearch,
            @PageableDefault(size = 5, page = 1, sort = "localDate", direction = Sort.Direction.ASC)
            Pageable pageable) {
        Page<Blog> blog = blogService.findAll(nameSearch.trim(), pageable);
        if (blog.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

    @GetMapping("/view-blog/{id}")
    public ResponseEntity<Optional<Blog>> getViewPage(@PathVariable("id") Long id) {
        Optional<Blog> blog = blogService.findById(id);
        if (!blog.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
}