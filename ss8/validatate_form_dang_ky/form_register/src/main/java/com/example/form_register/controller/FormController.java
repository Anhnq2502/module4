package com.example.form_register.controller;

import com.example.form_register.model.User;
import com.example.form_register.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class FormController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "/index";
    }

    @PostMapping("/checkRegister")
    public String checkRegister(@Valid @ModelAttribute("user") User user, BindingResult bindingResult,
                                RedirectAttributes redirect) {
        if (bindingResult.hasFieldErrors()) {
            return "/index";
        } else {
            iUserService.save(user);
            redirect.addFlashAttribute("msg", "Thêm mới thành công");
            return "redirect:/register";
        }
    }
}
