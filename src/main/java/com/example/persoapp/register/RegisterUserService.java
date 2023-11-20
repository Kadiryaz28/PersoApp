package com.example.persoapp.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserService {
    private final RegisterUserRepository registerUserRepository;

    @Autowired
    public RegisterUserService(RegisterUserRepository registerUserRepository) {
        this.registerUserRepository = registerUserRepository;
    }

    public void save(RegisterUser registerUser) {
        registerUserRepository.save(registerUser);
    }

    public boolean isValidUser(String username, String password) {
        RegisterUser registerUser = registerUserRepository.findByUsername(username);
        return registerUser!= null && registerUser.getPassword().equals(password);
    }
}