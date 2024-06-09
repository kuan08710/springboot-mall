package com.louis.springbootmall.dto;

import lombok.Data;

@Data
public class OrderQueryParams {
    Integer userId;
    Integer limit;
    Integer offset;
}