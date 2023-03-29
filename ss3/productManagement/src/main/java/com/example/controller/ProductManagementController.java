package com.example.controller;

import com.example.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductManagementController {
    @Autowired
    private ProductService productService;

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("products", productService.findAll());
        return "/index";
    }
    @GetMapping("/create")
    public String showPageCreate(){
        return "/create";
    }
    @GetMapping("/update")
    public String showPageUpdate(){
        return "/update";
    }
    @GetMapping("/details")
    public String showPageDetails(){
        return "/details";
    }
}
