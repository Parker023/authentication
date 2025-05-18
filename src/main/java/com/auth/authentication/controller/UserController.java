package com.auth.authentication.controller;

import com.auth.authentication.dto.UserDto;
import com.auth.authentication.service.UserEntityService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserEntityService userEntityService;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/user-register")
    public ResponseEntity<String> registerUser(@Valid @RequestBody UserDto user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userEntityService.save(user);
        return ResponseEntity.ok("User registered successfully!!!");
    }

    @GetMapping("/users")
    public ResponseEntity<?> users() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return ResponseEntity.ok("Fetched Users Successfully");
    }

}
