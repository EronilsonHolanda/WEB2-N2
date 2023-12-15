package com.evento.evento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {
    
    @GetMapping
    String loadHome(){
        return "redirect:/eventos";
    }
}
