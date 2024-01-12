package com.maveric.ecommerce.customerms.controllers;

import com.maveric.ecommerce.customerms.exceptions.CustomerNotFoundException;
import com.maveric.ecommerce.customerms.exceptions.InvalidIDException;
import jakarta.validation.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CentralizedExceptionHandler {

    private static final Logger Log= LoggerFactory.getLogger(CentralizedExceptionHandler.class);

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({InvalidIDException.class,CustomerNotFoundException.class})
    public String handleCustomerNotFound(Exception e){
        Log.info("handling exception in handleCustomerNotFound",e);
        return e.getMessage();
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({ConstraintViolationException.class, MethodArgumentNotValidException.class})
    public String handleConstraintViolation(Exception e){
    Log.info("handling exception in handleConstraintViolation");
        return e.getMessage();
    }

}
