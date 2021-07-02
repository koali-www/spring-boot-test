package com.example.demo.web;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String index(){
        return "Hello World";
    }
    /*
    public String hello(Model model) {
        model.addAttribute("name","thymeleaf");
        return "hello";
    }*/
}
