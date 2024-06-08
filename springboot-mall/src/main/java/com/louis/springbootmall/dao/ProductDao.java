package com.louis.springbootmall.dao;

import com.louis.springbootmall.dto.ProductRequest;
import com.louis.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProducts ();

    Product getProductById (Integer productId);

    Integer createProduct (ProductRequest productRequest);

    void updateProduct (Integer productId , ProductRequest productRequest);

    void deleteProductById (Integer productId);
}
