package com.maveric.customerms.util;

import javax.validation.*;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;



public class CustomNotBlank implements ConstraintValidator<CustomNotBlankAnnotation ,String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
       return !(value==null || value.isBlank());
    }
}
