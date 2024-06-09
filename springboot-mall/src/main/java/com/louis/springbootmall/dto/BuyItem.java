package com.louis.springbootmall.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class BuyItem {

    @NotNull
    private Integer quantity;

    @NotNull
    private Integer productId;
}
