package com.bitcamp.web.controller;

import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

 @Controller
 public class HomeController{

     @Autowired CustomerService customerService; // 스레드들을 연결시켜준다. 여기선 customerservice와 연결.

     @RequestMapping("/") // 슬래시로 매핑..
     public String index() {
         System.out.println("루트 url 경로로 들어옴33");
         int count = customerService.countAll();
         System.out.println("고객의 총인원: " + count);
         return "index"; //properties에서  views에 있고 .html로 끝나는 파일로 설정을 해놓았기 때문에 index만 써도 됨
     }

 }
