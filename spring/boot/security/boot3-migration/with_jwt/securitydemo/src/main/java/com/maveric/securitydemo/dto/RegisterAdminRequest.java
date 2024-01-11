package com.maveric.securitydemo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import jakarta.validation.constraints.NotBlank;

@NoArgsConstructor
@Data
public class RegisterAdminRequest {
    @NotBlank
   @NonNull
    private String username;

    @NonNull
    @NotBlank
    private String password;
}
