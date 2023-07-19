package com.gachi.together.controller;

import com.gachi.together.domain.Post;
import com.gachi.together.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardContoller {

    private final PostRepository postRepository;

    @GetMapping("/")
    public String main(Model model) {
        List<Post> posts = new ArrayList<>();


        Post post1 = new Post();
        post1.setImageSrc("../../images/examples/fafa.png");
        post1.setTitle("독거 노인 어르신의 건강한 여름나기, 보양식으로 이겨내요!");
        post1.setCategory("안동시 종합 사회 복지관");
        post1.setParagraph("안동시 종합 사회 복지관에 도움을 주세요.");
        post1.setAmount("721,690원");
        posts.add(post1);

        post1.setImageSrc("../../images/examples/fafa.png");
        post1.setTitle("독거 노인 어르신의 건강한 여름나기, 보양식으로 이겨내요!");
        post1.setCategory("안동시 종합 사회 복지관");
        post1.setParagraph("안동시 종합 사회 복지관에 도움을 주세요.");
        post1.setAmount("721,690원");
        posts.add(post1);

        post1.setImageSrc("../../images/examples/fafa.png");
        post1.setTitle("독거 노인 어르신의 건강한 여름나기, 보양식으로 이겨내요!");
        post1.setCategory("안동시 종합 사회 복지관");
        post1.setParagraph("안동시 종합 사회 복지관에 도움을 주세요.");
        post1.setAmount("721,690원");
        posts.add(post1);

        post1.setImageSrc("../../images/examples/fafa.png");
        post1.setTitle("독거 노인 어르신의 건강한 여름나기, 보양식으로 이겨내요!");
        post1.setCategory("안동시 종합 사회 복지관");
        post1.setParagraph("안동시 종합 사회 복지관에 도움을 주세요.");
        post1.setAmount("721,690원");
        posts.add(post1);


        model.addAttribute("posts", posts);

        return "index"; // Return the Thymeleaf template name
    }

    @GetMapping("/2")
    public String main2(Model model) {

        List<Post> posts = new ArrayList<>();


        Post post1 = new Post();
        post1.setImageSrc("../../images/examples/fafa.png");
        post1.setTitle("독거 노인 어르신의 건강한 여름나기, 보양식으로 이겨내요!");
        post1.setCategory("안동시 종합 사회 복지관");
        post1.setParagraph("안동시 종합 사회 복지관에 도움을 주세요.");
        post1.setAmount("721,690원");
        posts.add(post1);

        post1.setImageSrc("../../images/examples/fafa.png");
        post1.setTitle("독거 노인 어르신의 건강한 여름나기, 보양식으로 이겨내요!");
        post1.setCategory("안동시 종합 사회 복지관");
        post1.setParagraph("안동시 종합 사회 복지관에 도움을 주세요.");
        post1.setAmount("721,690원");
        posts.add(post1);

        post1.setImageSrc("../../images/examples/fafa.png");
        post1.setTitle("독거 노인 어르신의 건강한 여름나기, 보양식으로 이겨내요!");
        post1.setCategory("안동시 종합 사회 복지관");
        post1.setParagraph("안동시 종합 사회 복지관에 도움을 주세요.");
        post1.setAmount("721,690원");
        posts.add(post1);

        post1.setImageSrc("../../images/examples/fafa.png");
        post1.setTitle("독거 노인 어르신의 건강한 여름나기, 보양식으로 이겨내요!");
        post1.setCategory("안동시 종합 사회 복지관");
        post1.setParagraph("안동시 종합 사회 복지관에 도움을 주세요.");
        post1.setAmount("721,690원");
        posts.add(post1);

        post1.setImageSrc("../../images/examples/fafa.png");
        post1.setTitle("독거 노인 어르신의 건강한 여름나기, 보양식으로 이겨내요!");
        post1.setCategory("안동시 종합 사회 복지관");
        post1.setParagraph("안동시 종합 사회 복지관에 도움을 주세요.");
        post1.setAmount("721,690원");
        posts.add(post1);

        post1.setImageSrc("../../images/examples/fafa.png");
        post1.setTitle("독거 노인 어르신의 건강한 여름나기, 보양식으로 이겨내요!");
        post1.setCategory("안동시 종합 사회 복지관");
        post1.setParagraph("안동시 종합 사회 복지관에 도움을 주세요.");
        post1.setAmount("721,690원");
        posts.add(post1);


        model.addAttribute("posts", posts);


        return "index"; // Return the Thymeleaf template name
    }


    @GetMapping("/posts")
    public String getPosts(Model model) {
        List<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "posts"; // Return the Thymeleaf template name
    }


    @GetMapping("/suggest")
    public String suggest(Model model) {
        return "suggest/donationproposal"; // Return the Thymeleaf template name
    }



}
