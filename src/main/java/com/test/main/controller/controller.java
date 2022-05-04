package com.test.main.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@Controller


@RestController
public class controller {

    @RequestMapping("/hello")
    public String handler01(){
        return "hello world";
    }

}
