package com.louis.springbootmall.model;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private Integer orderId;
    private Integer userId;
    private Integer totalAmout;
    private Date createdDate;
    private Date lastModifiedDate;
}
