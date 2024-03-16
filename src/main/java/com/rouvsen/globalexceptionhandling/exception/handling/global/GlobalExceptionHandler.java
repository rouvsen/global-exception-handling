package com.rouvsen.globalexceptionhandling.exception.handling.global;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, List<PropertyException>>> handleValidationErrors(MethodArgumentNotValidException ex) {
        List<PropertyException> errorList = ex.getBindingResult().getFieldErrors()
                .stream()
                .map(error -> new PropertyException(error.getField(), error.getDefaultMessage()))
                .toList();
        return new ResponseEntity<>(getErrorsMap(errorList), new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    private Map<String, List<PropertyException>> getErrorsMap(List<PropertyException> errors) {
        Map<String, List<PropertyException>> errorResponse = new HashMap<>();
        errorResponse.put("errors", errors);
        return errorResponse;
    }
}
