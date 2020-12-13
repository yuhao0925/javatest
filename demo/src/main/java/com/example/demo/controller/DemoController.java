package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DemoController {


    @ResponseBody
    @GetMapping("/hello")
    public String getHello() {

        ArrayList<Object> arrayList = new ArrayList<>();

        System.out.println("123456");



        Map<String, Object> stringObjectMap = new HashMap<>();

        return "hello idea!!!";
    }
}
