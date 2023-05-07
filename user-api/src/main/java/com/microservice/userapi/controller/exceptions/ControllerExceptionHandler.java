package com.microservice.userapi.controller.exceptions;

import com.microservice.userapi.exceptions.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException ex, HttpServletRequest request){
       return ResponseEntity.status(HttpStatus.NOT_FOUND)
               .body(new StandardError(
                       LocalDateTime.now(),
                       ex.getMessage(),
                       HttpStatus.NOT_FOUND.value(),
                       request.getRequestURI()));
    }
}
