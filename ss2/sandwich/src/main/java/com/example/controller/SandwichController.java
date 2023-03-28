package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @RequestMapping("/")
    public String loadIndex() {
        return "/index";
    }

    @GetMapping("/index")
    public String save(@RequestParam(value = "condiment",required = false) String[] condiment, ModelMap modelMap) {
        modelMap.addAttribute("condiment", condiment);
        return "/index";
    }

}
