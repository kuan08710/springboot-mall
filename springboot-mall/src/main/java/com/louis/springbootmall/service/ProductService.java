package com.louis.springbootmall.service;

import com.louis.springbootmall.dto.ProductQueryParams;
import com.louis.springbootmall.dto.ProductRequest;
import com.louis.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts (ProductQueryParams productQueryParams);

    Product getProductById (Integer productId);

    Integer createProduct (ProductRequest productRequest);

    void updateProduct (Integer productId , ProductRequest productRequest);

    void deleteProductById (Integer productId);
}
