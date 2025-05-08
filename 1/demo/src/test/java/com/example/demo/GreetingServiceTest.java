package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;


public class GreetingServiceTest {
    private HelloService helloService;
    private TimeService timeService;
    private GreetingService greetingService;

    @BeforeEach
    void setUp() {
        helloService = mock(HelloService.class);
        timeService = mock(TimeService.class);

        //ustalamy zachowanie mockow
        when(helloService.sayHello()).thenReturn("Just a test greetings");
        when(timeService.getCurrentTime()).thenReturn("12:34:56.789");

        greetingService = new GreetingService(helloService, timeService);
    }

    @Test
    void greetingTest() {
        String combined = helloService.sayHello() + " Teraz jest: " + timeService.getCurrentTime();

        assertThat(combined).isEqualTo("Just a test greetings Teraz jest: 12:34:56.789");
    }
}
