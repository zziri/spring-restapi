package com.rest.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/redirect")
public class RedirectController {
    @GetMapping
    public String redirect() {
        return "redirect:https://naver.com";
    }
}
