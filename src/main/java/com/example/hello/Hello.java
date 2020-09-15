package com.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class Hello {

    @RequestMapping("/hello")
    public String sayHI(){
        return "HI";
    }
}
