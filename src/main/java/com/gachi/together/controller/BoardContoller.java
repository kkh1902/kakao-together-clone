package com.gachi.together.controller;

import com.gachi.together.domain.Post;
import com.gachi.together.repository.PostRepository;
import jdk.jshell.SourceCodeAnalysis;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

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
