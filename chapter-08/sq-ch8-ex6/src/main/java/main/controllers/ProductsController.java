package main.controllers;

import main.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import main.service.ProductService;

@Controller
public class ProductsController {
    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products";
    }

    @PostMapping("/products")
    public String addProduct(
            Product product,
            Model model
    ) {
        productService.addProduct(product);
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products";
    }
}
