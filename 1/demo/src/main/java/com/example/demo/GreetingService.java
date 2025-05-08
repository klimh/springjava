package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private final HelloService helloService;
    public final TimeService timeService;

    public GreetingService(HelloService helloService, TimeService timeService) {
        this.helloService = helloService;
        this.timeService = timeService;
    }

    public String great() {
        return helloService.sayHello()
        + " Teraz jest: " + timeService.getCurrentTime();
    }
}
