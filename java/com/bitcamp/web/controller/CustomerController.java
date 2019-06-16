package com.bitcamp.web.controller;

import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * CustomerController
 */
public class CustomerController {

    @Autowired CustomerService customerService;
    @RequestMapping("/count")
    public String count(){
        System.out.println("CustomerController() 경로로 들어옴");
        int count = customerService.countAll();
        System.out.println("고객의 총인원: "+ count);
    return count + "";
}
}