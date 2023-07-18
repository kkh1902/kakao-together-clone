package com.gachi.together.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/donations")
public class DonationController {

    @GetMapping("/main")
    public String donationmain() {
        return "donation/donation_main";
    }
}
