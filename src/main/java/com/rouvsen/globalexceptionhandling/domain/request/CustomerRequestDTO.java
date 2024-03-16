package com.rouvsen.globalexceptionhandling.domain.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CustomerRequestDTO {

    //required
    @NotBlank
    @Size(min = 5, max = 50)
    private String firstName;

    private String lastName;

    //required
    @NotBlank
    private String email;

    private String phone;

}
