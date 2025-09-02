package com.fintech.service;

import com.fintech.dto.PaymentRequest;
import com.fintech.dto.PaymentResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GWServicesImpl implements IGWServices{



    @Override
    public PaymentResponse processPayment(PaymentRequest request) {
        String transactionId = UUID.randomUUID().toString();
        String status = "SUCCESS";

        System.out.println("Processing payment from " + request.getFromAccount() +
                " to " + request.getToAccount() +
                " amount: " + request.getAmount());

        return new PaymentResponse(transactionId, status);
    }
}
