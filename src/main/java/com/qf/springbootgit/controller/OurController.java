package com.qf.springbootgit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("our")
public class OurController {

   @RequestMapping("hello")
   @ResponseBody
    public String hello() {
        System.out.println("springboot-big hello!!!!!");
        return "hello";

    }
}
