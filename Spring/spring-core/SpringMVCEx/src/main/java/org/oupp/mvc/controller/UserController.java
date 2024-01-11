package org.oupp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/signup")
    public String registrationPage(){
        return "signup";
    }

    @RequestMapping("/login")
    public String loginPage(){
        return "login";
    }
}
