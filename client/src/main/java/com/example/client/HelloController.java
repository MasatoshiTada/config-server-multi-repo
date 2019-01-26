package com.example.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final String message1;
    private final String message2;

    public HelloController(@Value("${message1}") String message1,
                           @Value("${message2}") String message2) {
        this.message1 = message1;
        this.message2 = message2;
    }

    @GetMapping("/")
    public HelloResource hello() {
        return new HelloResource(message1, message2);
    }
}
