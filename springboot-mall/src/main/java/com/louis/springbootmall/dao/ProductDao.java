package com.louis.springbootmall.dao;

import com.louis.springbootmall.dto.ProductQueryParams;
import com.louis.springbootmall.dto.ProductRequest;
import com.louis.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProducts (ProductQueryParams productQueryParams);

    Integer countProduct (ProductQueryParams productQueryParams);

    Product getProductById (Integer productId);

    Integer createProduct (ProductRequest productRequest);

    void updateProduct (Integer productId , ProductRequest productRequest);

    void updateStock(Integer productId, Integer stock);

    void deleteProductById (Integer productId);
}
