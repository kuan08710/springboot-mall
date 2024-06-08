package com.louis.springbootmall.dao;

import com.louis.springbootmall.dto.ProductRequest;
import com.louis.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById (Integer productId);

    Integer createProduct (ProductRequest productRequest);

    void updateProduct (Integer productId , ProductRequest productRequest);
}
