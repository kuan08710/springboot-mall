package com.louis.springbootmall.service;

import com.louis.springbootmall.dto.CreateOrderRequest;
import com.louis.springbootmall.model.Order;

public interface OrderService {
    Integer createOrder (Integer userId , CreateOrderRequest createOrderRequest);

    Order getOrderById (Integer orderId);
}
