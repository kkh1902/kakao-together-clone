package com.gachi.together.controller;

import com.gachi.together.domain.Post;
import jdk.jshell.SourceCodeAnalysis;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/fundraisings")
public class FundController {

    @GetMapping("/now")
    public String fundraisingsnow(Model model) {

        return "fundraising/fundraisingnow"; // Return the Thymeleaf template name
    }

//    @PostMapping("/propose")
//    public String suggestsubmit(@RequestBody Suggestion suggestion) {
//
//        System.out.println("Received suggestion: " + suggestion);
//
//        return "promotions/promotions"; // Return the Thymeleaf template name
//    }


}
