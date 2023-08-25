package com.gachi.together.controller;

import com.gachi.together.domain.Post;
import com.gachi.together.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequiredArgsConstructor
@RequestMapping("/fundraisings")
public class FundController {

    private final PostService postService;

    @GetMapping("/now")
    public String fundraisingsnow(Model model) {
        List<Post> posts = postService.getAllPosts(); // Assuming a method to get all posts
        model.addAttribute("posts", posts);
        System.out.println(posts);
        // Add necessary data to the model if needed
        return "fundraising/fundraisingnow"; // Return the Thymeleaf template name
    }

    /* 모금 제안 */
    @PostMapping("/propose")
    public String suggestsubmit(Post post) {
        System.out.println("Received post: " + post);
        postService.savePost(post); // Call the savePost method on postService

        // Redirect to a success page or perform any necessary actions
        return "redirect:/"; // Redirect to the desired page
    }
}
