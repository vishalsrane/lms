package com.theclasshub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/")
    public String loginPage(){
        System.out.println("hey how are you");
        return "hi";
    }
}
