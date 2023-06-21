package com.example.urlhandlermapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/hello")
    public String greeting(Model model){
        model.addAttribute("tagline","hello");
        return "welcom";
    }
    @GetMapping("/sayspring")
    public String saySpring(Model model){
        model.addAttribute("tagline","Say Spring MVC");
        return  "welcom";
    }
    @GetMapping("/")
    public String welcome(Model model){
        model.addAttribute("tagline","Welcome Spring MVC");
        return "welcom";
    }
}
