package com.example.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class LoginControl {


    @GetMapping("/home")
    public  String home(){
        return "home";

    }
@GetMapping("/login")
    public  String login(){
    return "login";
}

}
