package com.louis.springbootmall.service;

import com.louis.springbootmall.dto.CreateOrderRequest;
import com.louis.springbootmall.dto.OrderQueryParams;
import com.louis.springbootmall.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Integer countOrder(OrderQueryParams orderQueryParams);
    Integer createOrder (Integer userId , CreateOrderRequest createOrderRequest);
    Order getOrderById (Integer orderId);
}
