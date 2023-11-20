package com.example.persoapp.dashboard;

import com.example.persoapp.register.RegisterUser;
import com.example.persoapp.register.RegisterUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.persoapp.login.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DashboardController {

    private final RegisterUserService registerUserService;

    public DashboardController(RegisterUserService registerUserService) {
        this.registerUserService = registerUserService;
    }

    @PostMapping("/dashboard")
    public String processDashboard(@RequestParam("username") String username, Model model) {
        model.addAttribute("username", username);
        return "dashboard";
    }
}
