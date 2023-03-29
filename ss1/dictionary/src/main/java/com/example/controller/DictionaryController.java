package com.example.controller;

import com.example.service.impl.DictionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    private DictionaryService dictionaryService = new DictionaryService();

    @GetMapping("/search")
    public String search() {
        return "/index";
    }

    @PostMapping("/result")
    public String meaning(@RequestParam String keyword, Model model) {
                model.addAttribute("word", dictionaryService.findAll(keyword));
                model.addAttribute("key", keyword);
        return "/mean";
    }
}
