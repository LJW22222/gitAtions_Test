package com.example.gitaction_test.controller;

import com.example.gitaction_test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test/exception")
@RequiredArgsConstructor
public class ExceptionController {

    private final TestService testService;

    @GetMapping("/test/{name}")
    public ResponseEntity<?> getExceptionTest(@PathVariable("name") String name){
        return ResponseEntity.ok().body(testService.findUser(name));
    }

}
