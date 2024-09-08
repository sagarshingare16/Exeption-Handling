package com.example.advice;

import com.example.exception.CustomerAlreadyExistsException;
import com.example.exception.NoSuchCustomerExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoSuchCustomerExistsException.class)
    public ResponseEntity<?> handleException(NoSuchCustomerExistsException ex, WebRequest request){
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND.value(),
                ex.getMessage(), LocalDateTime.now(),request.getDescription(false));
        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(CustomerAlreadyExistsException.class)
    public ResponseEntity<?> handleException(CustomerAlreadyExistsException ex,WebRequest request){
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.CONTINUE.value(),
                ex.getMessage(), LocalDateTime.now(),request.getDescription(false));
        return new ResponseEntity<>(errorResponse,HttpStatus.CONFLICT);
    }
}
