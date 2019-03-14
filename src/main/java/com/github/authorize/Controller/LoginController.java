package com.github.authorize.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/hogefuga")
    public String home() {
        return "home";
    }
}
