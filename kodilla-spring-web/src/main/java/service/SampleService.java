package com.kodilla.spring.web.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

    public String getMessage() {
        return "This is a message from the service layer.";
    }
}
