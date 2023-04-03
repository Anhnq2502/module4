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

    @PostMapping("/create")
    public String create(Model model, @RequestParam(name = "productID") Integer productID,
                         @RequestParam(name = "productName") String productName,
                         @RequestParam(name = "productPrice") Double productPrice,
                         @RequestParam(name = "productDetail") String productDetail,
                         @RequestParam(name = "productProducer") String productProducer) {
        Product product = new Product(productID, productName, productPrice, productDetail, productProducer);
        productService.save(product);
        model.addAttribute("product", product);
        return "/create";
    }

    @GetMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        productService.delete(product.getProductID());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/product";
    }

    @GetMapping("/update/{productID}")
    public String showPageUpdate(Model model, @PathVariable Integer productID) {
        model.addAttribute("product", productService.findById(productID));
        return "/update";
    }

    @PostMapping("/update")
    public String update(Product product) {
        productService.update(product.getProductID(), product);
        return "redirect:/product";
    }

    @GetMapping("/details/{productID}")
    public String details(@PathVariable Integer productID, Model model) {
        model.addAttribute("product", productService.findById(productID));
        return "/details";
    }

    @PostMapping("/findByName")
    public String findByName(@PathVariable String productName, Model model) {
        model.addAttribute("product", productService.findByName(productName));
        return "/list";
    }
}
