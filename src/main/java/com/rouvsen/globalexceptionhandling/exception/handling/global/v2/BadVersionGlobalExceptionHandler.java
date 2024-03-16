package com.rouvsen.globalexceptionhandling.exception.handling.global.v2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

//@RestControllerAdvice
public class BadVersionGlobalExceptionHandler {

//    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
