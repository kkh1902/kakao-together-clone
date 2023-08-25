package com.gachi.together.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    @GetMapping("/login")
    public String loginpage(Model model) {
        return "login/login"; // Return the Thymeleaf template name
    }

    @GetMapping("/signup")
    public String signuppage(Model model) {
        return "login/join"; // Return the Thymeleaf template name
    }
}
