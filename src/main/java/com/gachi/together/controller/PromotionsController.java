package com.gachi.together.controller;

import jdk.jshell.SourceCodeAnalysis;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/promotions")
public class PromotionsController {

    @GetMapping("/all")
    public String promotionspage(Model model) {
        return "promotions/promotions"; // Return the Thymeleaf template name
    }



}
