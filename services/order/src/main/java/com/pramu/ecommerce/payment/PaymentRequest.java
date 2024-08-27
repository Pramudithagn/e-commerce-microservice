package com.pramu.ecommerce.payment;

import com.pramu.ecommerce.customer.CustomerResponse;
import com.pramu.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}