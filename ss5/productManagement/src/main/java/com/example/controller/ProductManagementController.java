package com.example.controller;

import com.example.model.Product;
import com.example.service.impl.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/product")
public class ProductManagementController {
    private final ProductService productService;

    public ProductManagementController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("")
    public String list(Model model) {
        model.addAttribute("products", productService.findAll());
        return "/list";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }
    @GetMapping("/delete/{productID}")
    public String showPageDelete(@PathVariable Integer productID, Model model) {
        model.addAttribute("product", productService.findById(productID));
        return "/delete";
    }
    @GetMapping("/update/{productID}")
    public String showPageUpdate(Model model,@PathVariable Integer productID){
        model.addAttribute("product",productService.findById(productID));
        return "/update";
    }
    @GetMapping("/details/{productID}")
    public String details(@PathVariable Integer productID, Model model) {
        model.addAttribute("product", productService.findById(productID));
        return "/details";
    }
    @PostMapping("/create")
    public String create(Model model,@RequestParam(name = "productID")Integer productID,
                         @RequestParam(name = "productName") String productName,
                         @RequestParam(name = "productPrice") Double productPrice,
                         @RequestParam(name = "productDetail") String productDetail) {
        Product product = new Product(productID,productName,productPrice,productDetail);
        productService.save(product);
        model.addAttribute("product",product);
        return "/create";
    }
    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        productService.delete(product.getProductID());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/product";
    }
    @PostMapping("/update")
    public String update(Product product){
        productService.update(product.getProductID(),product);
        return "redirect:/product";
    }
}
