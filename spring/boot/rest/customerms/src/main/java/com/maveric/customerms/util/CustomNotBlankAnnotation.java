package com.maveric.customerms.util;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy =  {CustomNotBlank.class})
@Target({ METHOD, FIELD })
@Retention(RUNTIME)
public @interface CustomNotBlankAnnotation {
    String message() default "input can't be null or blank";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };

}
