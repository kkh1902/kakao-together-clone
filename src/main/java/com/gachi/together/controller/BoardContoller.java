package com.gachi.together.controller;

import com.gachi.together.domain.Post;
import com.gachi.together.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardContoller {

    private final PostRepository postRepository;

    @GetMapping("/")
    public String main(Model model) {
        List<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "index"; // Return the Thymeleaf template name
    }


    @GetMapping("/posts")
    public String getPosts(Model model) {
        List<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "posts"; // Return the Thymeleaf template name
    }
}
