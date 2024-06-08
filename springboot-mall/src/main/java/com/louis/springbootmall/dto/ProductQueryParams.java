package com.louis.springbootmall.dto;

import com.louis.springbootmall.constant.ProductCategory;
import lombok.Data;

@Data
public class ProductQueryParams {

    ProductCategory category;
    String search;
    String orderBy;
    String sort;
}
