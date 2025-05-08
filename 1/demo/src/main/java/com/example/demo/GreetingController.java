package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/co/co")
    public GreetingDto getGreeting() {
        //komponujemy tekst powitania i zwracamy DTO
        //String text = greetingService.great();
        return new GreetingDto(greetingService.great());
    }

    @PostMapping("/noco/noco")
    public GreetingDto postGreeting(@RequestBody NameRequest request) {
        String msg = "Hello, " + request.getName();
        return new GreetingDto(msg);
    }


}
