package com.louis.springbootmall.service;

import com.louis.springbootmall.dto.ProductRequest;
import com.louis.springbootmall.model.Product;

public interface ProductService {
    Product getProductById (Integer productId);

    Integer createProduct (ProductRequest productRequest);

    void updateProduct (Integer productId , ProductRequest productRequest);

    void deleteProductById (Integer productId);
}
