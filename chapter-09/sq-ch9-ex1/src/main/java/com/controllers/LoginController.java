package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/")
    public String loginGet() {
        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(
            @RequestParam String username,
            @RequestParam String password,
            Model model
    ) {
        boolean loggedIn = false;
        if (loggedIn) {
            model.addAttribute("message", "Вы вошли в систему.");
        } else {
            model.addAttribute("message", "Вход в систему не выполнен!");
        }
        return "login.html";
    }
}
