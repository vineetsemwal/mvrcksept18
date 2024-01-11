package com.maveric.securitydemo.util;

import jakarta.validation.*;


public class CustomNotBlank implements ConstraintValidator<CustomNotBlankAnnotation ,String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
       return !(value==null || value.isBlank());
    }
}
