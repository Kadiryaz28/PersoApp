package com.example.persoapp.register;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegisterUserRepository extends JpaRepository<RegisterUser, Long> {
    RegisterUser findByUsername(String username);

}
