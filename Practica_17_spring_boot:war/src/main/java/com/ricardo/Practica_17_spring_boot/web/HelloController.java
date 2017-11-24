package com.ricardo.Practica_17_spring_boot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {

        model.addAttribute("saludo", "Spring Boot");

        return "hello";

    }

}
