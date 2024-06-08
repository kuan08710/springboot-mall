package com.louis.springbootmall.dao;

import com.louis.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
