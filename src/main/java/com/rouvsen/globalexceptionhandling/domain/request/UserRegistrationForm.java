package com.rouvsen.globalexceptionhandling.domain.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRegistrationForm {

    @NotBlank
    private String name;

    @Email
    private String email;

    @Size(min = 8, max = 25)
    private String password;

}
