package com.ericlam.main.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping(value = "void")
    public void noReturn(){
        System.out.println("Do something");
    }

    @GetMapping(value = "return",params = "bool")
    public Map result(@RequestParam boolean bool){
        Map<String,Boolean> result = new HashMap<>();
        result.put("success",bool);
        return result;
    }

}
