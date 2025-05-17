package com.auth.authentication.controller;

import com.auth.authentication.service.UserEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserEntityService userEntityService;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/user-register")
    public ResponseEntity<String> registerUser(@RequestBody)

}
