package com.rouvsen.globalexceptionhandling.controller.global;

import com.rouvsen.globalexceptionhandling.domain.request.CustomerRequestDTO;
import com.rouvsen.globalexceptionhandling.domain.response.CustomerResponseDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/1.0/customers")
public class CustomerController {

    @PostMapping
    public CustomerResponseDTO create(@RequestBody @Valid CustomerRequestDTO customerRequestDTO) {
        return CustomerResponseDTO.builder()
                .firstName(customerRequestDTO.getFirstName())
                .email(customerRequestDTO.getEmail())
                .build();
    }
}
