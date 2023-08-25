package com.gachi.together.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/contact")
public class ContactController {

    @GetMapping()
    public String contactPage(Model model) {
        return "contact/contact"; // Return the Thymeleaf template name
    }


}
