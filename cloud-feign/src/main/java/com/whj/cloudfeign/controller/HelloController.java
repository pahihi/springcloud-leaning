package com.whj.cloudfeign.controller;

import com.whj.cloudfeign.feign.hiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    hiService hiService;

    @GetMapping("/get/{name}")
    public String get(@PathVariable String name) {
        return hiService.sayHiFromClientOne(name);
    }
}
