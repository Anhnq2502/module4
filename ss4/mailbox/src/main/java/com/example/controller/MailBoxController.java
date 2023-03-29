package com.example.controller;

import com.example.model.MailBox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MailBoxController {

    @GetMapping("/index")
    String index(Model model, @RequestParam(name = "language",required = false) String language,
                  @RequestParam(name = "pageSize",required = false) Integer pageSize,
                  @RequestParam(name = "spamsFilter",required = false) String spamsFilter,
                  @RequestParam(name = "signature",required = false) String signature){
        MailBox mailBox = new MailBox(language,pageSize,spamsFilter,signature);
        model.addAttribute("mailBox",mailBox);
        return "/index";
    }

    @GetMapping("/update")
    String showPageUpdate(Model model){
        model.addAttribute("mailBox", new MailBox());
        String[] languages = new String[] {"English","Vietnamese","Japanese","Chinese"};
        Integer[] pageSizes = new Integer[] {5,10,15,25,50,100};
        model.addAttribute("languages",languages);
        model.addAttribute("pageSizes",pageSizes);
        return "/update";
    }
}
