package com.hdu.springboot_demo_mongodb.com.hdu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot + MongoDB";
    }
}
