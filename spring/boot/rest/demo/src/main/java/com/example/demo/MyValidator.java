package com.example.demo;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MyValidator implements ConstraintValidator<MyValidatorAnnotation,String> {
    @Override
    public boolean isValid(String input, ConstraintValidatorContext validatorContext) {
        return !(input==null||input.isBlank());
    }
}
