package com.auth.authentication.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LoginRequest {
    @NotNull(message = "username is null")
    private String username;
    @NotNull(message = "password is null")
    private String password;
}
