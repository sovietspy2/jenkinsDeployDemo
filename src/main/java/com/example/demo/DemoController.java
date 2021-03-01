package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(path = "/test")
    public String test() {
        return "Hello there! General Kenobi!";
    }


}
