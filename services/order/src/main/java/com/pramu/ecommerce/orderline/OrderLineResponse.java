package com.pramu.ecommerce.orderline;

public record OrderLineResponse(
        Integer id,
        double quantity
) { }