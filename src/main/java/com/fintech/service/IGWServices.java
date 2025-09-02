package com.fintech.service;

import com.fintech.dto.PaymentRequest;
import com.fintech.dto.PaymentResponse;

public interface IGWServices {

    PaymentResponse processPayment(PaymentRequest paymentRequest);
}
