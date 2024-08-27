package com.pramu.ecommerce.kafka;

import com.pramu.ecommerce.customer.CustomerResponse;
import com.pramu.ecommerce.order.PaymentMethod;
import com.pramu.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}