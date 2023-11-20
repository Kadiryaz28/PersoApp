package com.example.persoapp.register;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class RegisterUserController {
    private final RegisterUserService userService;

    public RegisterUserController(RegisterUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registerUser")
    public String showRegisterForm(Model model) {
        RegisterUser registerUser = new RegisterUser();
        model.addAttribute("registerUser", registerUser);
        return "registerUser";
    }

    @PostMapping("/registerUser")
    public String processRegister(@ModelAttribute("registerUser") RegisterUser registerUser) {
        userService.save(registerUser);
        return "redirect:/";
    }
}