package com.rouvsen.globalexceptionhandling.controller.global;

import com.rouvsen.globalexceptionhandling.domain.request.UserRegistrationForm;
import com.rouvsen.globalexceptionhandling.service.UserRegistrationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/1.0/register")
public class UserRegistrationController {

    private final UserRegistrationService userRegistrationService;

    @PostMapping
    public ResponseEntity<?> registerUser(
            @Valid @RequestBody UserRegistrationForm form) {
        return userRegistrationService.register(form);
    }
}
