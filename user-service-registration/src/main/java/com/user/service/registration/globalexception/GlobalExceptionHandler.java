package com.user.service.registration.globalexception;

import com.user.service.registration.exception.UserNotFoundException;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.ValidationException;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Configuration
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> userNOtFoundException(UserNotFoundException userNotFoundException){
        return new ResponseEntity<>(userNotFoundException.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity violationException(MethodArgumentNotValidException methodArgumentNotValidException){
        return new ResponseEntity(methodArgumentNotValidException.getMessage(),HttpStatus.BAD_REQUEST);
    }
}
