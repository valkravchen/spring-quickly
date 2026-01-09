package com.service;

import com.exceptions.NotEnoughMoneyException;
import com.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw  new NotEnoughMoneyException();
    }
}
