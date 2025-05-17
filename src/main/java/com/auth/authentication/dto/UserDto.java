package com.auth.authentication.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDto {
    @NotNull(message = "username is null")
    private String username;
    private String role;
    @NotNull(message = "password is null")
    private String password;
}
