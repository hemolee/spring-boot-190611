package com.bitcamp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

 @Controller
 public class HomeController{

     @RequestMapping("/") // 슬래시로 매핑..
     public String index() {
         System.out.println("루트 url 경로로 들어옴22");
         return "index"; //properties에서  views에 있고 .html로 끝나는 파일로 설정을 해놓았기 때문에 index만 써도 됨
     }

 }
