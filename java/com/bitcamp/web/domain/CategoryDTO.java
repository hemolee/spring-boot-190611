package com.bitcamp.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * CategoryDTO
 */
@Data 
@Component 
@Lazy   //component는 타입지정, lazy는 나중에 코딩추가변경하려고 쓰는것..설거지한번에 몰아서 하는 것처럼..
public class CategoryDTO {

    private String  categoryId,
    categoryName ,
    description ;

}