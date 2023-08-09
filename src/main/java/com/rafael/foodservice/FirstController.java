package com.rafael.foodservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController
{
    @GetMapping("/hello")
    @ResponseBody
    public String getHello(){
        return "Hello world!3";
    }
}
