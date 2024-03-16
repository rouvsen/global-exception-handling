package com.rouvsen.globalexceptionhandling.service;

import com.rouvsen.globalexceptionhandling.domain.request.UserRegistrationForm;
import com.rouvsen.globalexceptionhandling.exception.handling.global.v1.PropertyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserRegistrationService {

    public ResponseEntity<?> register(UserRegistrationForm form) {
        //business logic here
        return new ResponseEntity<>(new HashMap<>(), HttpStatus.CREATED);
    }
}
