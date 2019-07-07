package com.devopsfun.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WelcomeController {
      @RequestMapping("/")
    public String welcome(Model model) {
         model.addAttribute("course", "devops");
        return "index";
   }
}
