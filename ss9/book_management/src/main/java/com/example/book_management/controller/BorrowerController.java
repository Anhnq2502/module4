package com.example.book_management.controller;

import com.example.book_management.service.IBorrowerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BorrowerController {
    private final IBorrowerService borrowerService;

    public BorrowerController(IBorrowerService borrowerService) {
        this.borrowerService = borrowerService;
    }

    @GetMapping("/list_borrower_book")
    public String findAllBorrower(Model model) {
        model.addAttribute("listBorrower", borrowerService.findAllBorrower());
        return "/list_borrower";
    }
}