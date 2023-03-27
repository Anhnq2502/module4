package com.example.controller;

import com.example.service.ConverterServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConverterApp {
    ConverterServiceImpl service = new ConverterServiceImpl();

    @GetMapping("/converter")
    public String index() {
        return "/index";
    }

    @PostMapping("/usd")
    public String submit(@RequestParam(name = "usd", defaultValue = "0") float usd, @RequestParam(name = "rate", defaultValue = "0") float rate, Model model) {
        model.addAttribute("result1", service.converter(usd, rate));
        return "/submit";
    }
}
