package com.example.book_management.controller;

import com.example.book_management.common.InvalidCodeException;
import com.example.book_management.common.OutOfBookException;
import com.example.book_management.model.Borrower;
import com.example.book_management.service.IBookService;
import com.example.book_management.service.IBorrowerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BookController {
    private final IBookService bookService;

    private final IBorrowerService borrowerService;

    public BookController(IBookService bookService, IBorrowerService borrowerService) {
        this.bookService = bookService;
        this.borrowerService = borrowerService;
    }

    @GetMapping("")
    public String findAllBook(Model model) {
        model.addAttribute("books", bookService.findAllBook());
        model.addAttribute("borrower", new Borrower());
        return "/list-book";
    }

    @PostMapping("/borrow-book")
    public String borrowBook(@ModelAttribute("borrower") Borrower borrower, RedirectAttributes redirectAttributes) throws OutOfBookException {
        String code = borrowerService.setCodeBorrower();
        borrower.setCode(code);
        if (bookService.borrowerBook(borrower)){
            redirectAttributes.addFlashAttribute("mess", "Mượn sách thành công, " + "mã mượn sách là: " + code);
            redirectAttributes.addFlashAttribute("books", bookService.findAllBook());
        } else {
            redirectAttributes.addFlashAttribute("books", bookService.findAllBook());
            redirectAttributes.addFlashAttribute("mess", "Mượn sách thất bại");
        }
        return "/list-book";
    }

    @GetMapping("/return-book")
    public String returnBook(RedirectAttributes redirectAttributes, @RequestParam("code") String code) throws InvalidCodeException {
        if (bookService.returnBook(code)) {
            redirectAttributes.addFlashAttribute("mess", "Trả sách thành công");
            redirectAttributes.addFlashAttribute("books", bookService.findAllBook());
        } else {
            redirectAttributes.addFlashAttribute("mess", "Trả sách không thành công");
            redirectAttributes.addFlashAttribute("books", bookService.findAllBook());
        }
        return "redirect:/";

    }
}