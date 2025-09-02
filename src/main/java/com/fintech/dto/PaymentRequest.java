package com.fintech.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequest {

    @NotBlank(message = "From account cannot be blank")
    private String fromAccount;

    @NotBlank(message = "To account cannot be blank")
    private String toAccount;

    @Min(value = 1, message = "Amount must be greater than zero")
    private double amount;
}
