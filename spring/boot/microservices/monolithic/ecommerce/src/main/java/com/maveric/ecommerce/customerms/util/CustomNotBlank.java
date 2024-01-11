package com.maveric.ecommerce.customerms.util;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class CustomNotBlank implements ConstraintValidator<CustomNotBlankAnnotation ,String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
       return !(value==null || value.isBlank());
    }
}
