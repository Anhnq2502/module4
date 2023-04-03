package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.IBlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/blog")
public class BlogController {
    final
    IBlogService iBlogService;

    public BlogController(IBlogService iBlogService) {
        this.iBlogService = iBlogService;
    }

    @GetMapping("")
    public String list(Model model) {
        model.addAttribute("blogs", iBlogService.getAll());
        return "/list";
    }

    @GetMapping("/create")
    public String showPageCreate(Model model) {
        model.addAttribute("blog", new Blog());
        return "/create";
    }

    @PostMapping("/create")
    public String create(Model model, Blog blog) {
        model.addAttribute("blog", iBlogService.save(blog));
        return "/create";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam Integer id) {
        iBlogService.delete(id, iBlogService.getBlogById(id));
        return "redirect:/blog";
    }

    @GetMapping("/update/{id}")
    public String showPageUpdate(Model model, @PathVariable Integer id) {
        model.addAttribute("blog", iBlogService.getBlogById(id));
        return "/update";
    }

    @PostMapping("/update")
    public String update(Model model, Blog blog) {
        model.addAttribute("blog", iBlogService.update(blog));
        return "redirect:/blog";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable Integer id) {
        model.addAttribute("blog", iBlogService.getBlogById(id));
        return "/detail";
    }
}
