package com.fintech.controller;

import com.fintech.dto.PaymentRequest;
import com.fintech.dto.PaymentResponse;
import com.fintech.service.IGWServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.annotation.security.RolesAllowed;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/payments")
public class PaymentController  {

    private final IGWServices paymentService;

    public PaymentController(IGWServices paymentService) {
        this.paymentService = paymentService;
    }

    @RolesAllowed("admin")
    @PostMapping("/secure")
    @Operation(summary = "Process a secure payment",
            security = @SecurityRequirement(name = "bearerAuth"))
    public ResponseEntity<PaymentResponse> makePayment(@Valid @RequestBody PaymentRequest request) {
        PaymentResponse response = paymentService.processPayment(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/public")
    @Operation(summary = "Public endpoint for testing")
    public String publicEndpoint() {
        return "This endpoint is public and does not require authentication.";
    }

}
