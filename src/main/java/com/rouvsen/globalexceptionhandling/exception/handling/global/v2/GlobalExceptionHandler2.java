package com.rouvsen.globalexceptionhandling.exception.handling.global.v2;

import com.rouvsen.globalexceptionhandling.exception.handling.global.v1.PropertyException;
import com.rouvsen.globalexceptionhandling.exception.throwable.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler2 {

//    @ExceptionHandler(value = UserNotFoundException.class)
//    public ResponseEntity<String> handleException(UserNotFoundException ex) {
//        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
//    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, List<PropertyException>>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        Map<String, List<PropertyException>> errors = new HashMap<>();
        errors.put("errors", new ArrayList<>());
        ex.getBindingResult().getFieldErrors().forEach(fieldError ->
                errors.get("errors").add(
                        new PropertyException(fieldError.getField(), fieldError.getDefaultMessage())
                )
        );
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

}
