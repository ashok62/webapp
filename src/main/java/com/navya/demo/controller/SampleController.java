package com.navya.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    @GetMapping(value="/sayhello")
    public String sayHello(){

        return "Hello";
    }

}
