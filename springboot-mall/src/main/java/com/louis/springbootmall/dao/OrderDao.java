package com.louis.springbootmall.dao;

import com.louis.springbootmall.model.OrderItem;
import com.louis.springbootmall.model.Order;

import java.util.List;

public interface OrderDao {
    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);
}
