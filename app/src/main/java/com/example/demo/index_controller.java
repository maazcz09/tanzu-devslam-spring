package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class index_controller {
    @GetMapping("/")
    String index() {
        String x = "33";
       return "hello world" + x;
    }
}
