package pl.cthouse.www.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/LoginForm")
    public String  showLoginForm()
    {
        return "LoginForm";
    }

}
