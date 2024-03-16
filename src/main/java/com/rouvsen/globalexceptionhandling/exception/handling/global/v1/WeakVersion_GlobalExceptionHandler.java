package com.rouvsen.globalexceptionhandling.exception.handling.global.v1;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@RestControllerAdvice
public class WeakVersion_GlobalExceptionHandler {

//    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity< Map<String, List<String>> > exceptionHandler(
            MethodArgumentNotValidException exception) {
        List<String> errors = exception
                .getBindingResult()
                .getFieldErrors()
                .stream()
                .map(FieldError::getDefaultMessage)
                .toList();
        return new ResponseEntity<>(getErrorsMap(errors), new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    private Map<String, List<String>> getErrorsMap(List<String> errors) {
        Map<String, List<String>> errorsResult = new HashMap<>();
        errorsResult.put("errors", errors);
        return errorsResult;
    }

}
