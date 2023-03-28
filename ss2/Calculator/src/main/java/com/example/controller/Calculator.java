package com.example.controller;

import com.example.service.impl.CalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller

public class Calculator {
    final
    CalculatorService service;

    public Calculator(CalculatorService service) {
        this.service = service;
    }

    @RequestMapping("/calculate")
    public String calculator(ModelMap modelMap, @RequestParam(name = "number1", defaultValue = "0") double number1,
                             @RequestParam(name = "number2", defaultValue = "0") double number2,
                             @RequestParam(name = "calculation", defaultValue = "") String calcul) {
        if (number2 == 0 && calcul.equals("Division(/)")) {
            modelMap.addAttribute("message", "Không thể chia 1 số cho 0");
        } else {
            double result = 0;
            modelMap.addAttribute("number1", number1);
            modelMap.addAttribute("number2", number2);
            modelMap.addAttribute("calcul", calcul);
            modelMap.addAttribute("result", service.calculator(number1, number2, result, calcul));
        }
        return "index";
    }
}
