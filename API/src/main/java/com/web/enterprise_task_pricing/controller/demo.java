package com.web.enterprise_task_pricing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
public class demo {
    @GetMapping("/api")
    public String hello() {
        return "Design and Architecture needs to be designed";
    }
}
