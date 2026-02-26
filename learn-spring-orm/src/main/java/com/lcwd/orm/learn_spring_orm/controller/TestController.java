
package com.lcwd.orm.learn_spring_orm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String test(){
        return "ORM Working 🚀";
    }
}