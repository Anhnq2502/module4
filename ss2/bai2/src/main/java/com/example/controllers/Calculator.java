package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Caculator {
    @RequestMapping("/calculator")
    public String caculator(ModelMap modelMap, @RequestParam(name = "number1" defaultValue = "0") double number1,
                            @RequestParam(name = "number2" defaultValue = "0") double number2,
                            @RequestParam(name = "calculation", defaultValue = "") String calculation){
        
    }
}
