package com.gachi.together.controller;

import com.gachi.together.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BoardContoller {

    private final PostRepository postRepository;

    @GetMapping("/")
    public String main(Model model) {
        return "index"; // Return the Thymeleaf template name
    }




    @GetMapping("/suggest")
    public String suggest(Model model) {
        return "suggest/suggest"; // Return the Thymeleaf template name
    }




}
