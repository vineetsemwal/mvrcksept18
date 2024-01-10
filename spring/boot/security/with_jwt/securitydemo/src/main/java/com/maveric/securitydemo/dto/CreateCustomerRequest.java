package com.maveric.securitydemo.dto;

import com.maveric.securitydemo.util.CustomNotBlankAnnotation;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.*;


@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class CreateCustomerRequest {
    //@NotBlank(message = "name is not valid")
    @CustomNotBlankAnnotation(message = "name is not valid")
    @NonNull
    private String name;

    @NotBlank
    @NonNull
    private String username;

    @NotBlank
    @NonNull
    private String password;

    @Max(100)
    @Min(10)
    @NonNull
    private int age;

    @NonNull
    private double balance;

}
