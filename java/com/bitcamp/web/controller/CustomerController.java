package com.bitcamp.web.controller;

import java.util.HashMap;

import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CustomerController
 */
@RestController // controller의 자식..controller역할+rest역할
@RequestMapping("/customers")
public class CustomerController {
    @Autowired CustomerDTO customer;
    @Autowired CustomerService customerService;	
   
    @RequestMapping("/count")
    public String count() {
        System.out.println("CustomerController() 경로로 들어옴");
        int count = customerService.countAll();
        System.out.println("고객의 총인원: " + count);
        return count + "";
    }

    @GetMapping("/{customerId}/{password}") //{}부분은 바뀐다는 의미. .view(js)에서 보내는 값 받아오기..
    public CustomerDTO login(@PathVariable("customerId")String id, 
                             @PathVariable("password")String pass) {
                            
        System.out.println("컨트롤러넘어온 pw:"+ pass);

        customer.setCustomerId(id); /// 힙에 있는 DTO instance에 저장
        customer.setPassword(pass);
      

       return customerService.login(customer);
    }

    @PostMapping("") //join쿼리는 insert니까 postmapping사용, insert는 id가 없다+클래스 전체 어노테이션으로 /customers/줌->비워둠
    public HashMap<String,Object> join(@RequestBody CustomerDTO param){ //hashmap이 json하고 호환됨..
        System.out.println("=====post mapping======");
        System.out.println(param.getCustomerId());
        System.out.println(param.getPassword());
        System.out.println(param.getCustomerName());

        HashMap<String,Object> map = new HashMap<>();
        map.put("result","success");

        customerService.addCustomer(param);

        return map;
    }
}