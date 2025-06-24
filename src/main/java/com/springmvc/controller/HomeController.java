package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

    @RequestMapping("/home")
    public String home() {
        return "home";
    } 


    @RequestMapping("/about")

    public String about() {
        System.out.print("Hello World!\n");
        return "about";
    }
}
