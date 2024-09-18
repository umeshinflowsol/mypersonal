package com.mypratice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/message")
    public String message(String message) {
        message = "my controller is created";
        return message;

    }

}
