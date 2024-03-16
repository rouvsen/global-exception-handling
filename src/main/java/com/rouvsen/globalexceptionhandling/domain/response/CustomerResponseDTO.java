package com.rouvsen.globalexceptionhandling.domain.response;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CustomerResponseDTO {

    //required
    @NotBlank
    private String firstName;

    //required
    @NotBlank
    private String email;

}
