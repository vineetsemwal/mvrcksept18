package com.maveric.securitydemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoginRequest {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
