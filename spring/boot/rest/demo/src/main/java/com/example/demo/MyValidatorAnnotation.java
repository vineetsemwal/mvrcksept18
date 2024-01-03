package com.example.demo;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotNull;

import java.lang.annotation.*;
import java.util.List;

@Target({ ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(
        validatedBy = {MyValidator.class}
)
public  @interface MyValidatorAnnotation {
    String message() default "{cant be null or empty}";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
