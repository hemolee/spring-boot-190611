package com.bitcamp.web.domain;

import lombok.Data;

/**
 * OrderDetailDTO
 */
@Data
public class OrderDetailDTO {

    private String orderDetailId ,
    orderId ,
    productId ,
    quantity ;
}