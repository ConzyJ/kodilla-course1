package com.kodilla.spring.web.controller;

import com.kodilla.spring.web.service.SampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    private final SampleService sampleService;

    public HelloController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/message")
    public String getMessage() {
        return sampleService.getMessage();
    }
}
