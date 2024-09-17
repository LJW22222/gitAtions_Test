package com.example.gitaction_test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test2")
public class TestController2 {


    @GetMapping
    public ResponseEntity<?> testController() {

        return ResponseEntity.ok("Test2 Controller");
    }
}
