package com.example.persoapp.login;

import com.example.persoapp.register.RegisterUser;
import com.example.persoapp.register.RegisterUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    private final RegisterUserService registerUserService;

    public LoginController(RegisterUserService registerUserService) {
        this.registerUserService = registerUserService;
    }
    @GetMapping("/")
    public String showLoginForm(Model model) {
        RegisterUser registerUser = new RegisterUser();
        model.addAttribute("registerUser", registerUser);
        return "index";
    }
    @PostMapping("/")
    public String processLogin(@ModelAttribute("registerUser") RegisterUser registerUser, Model model){
        if(registerUserService.isValidUser(registerUser.getUsername(), registerUser.getPassword())){
            return("redirect:/dashboard");
        } else {
            model.addAttribute("loginError", true);
        }
        return "index";
    }
}
