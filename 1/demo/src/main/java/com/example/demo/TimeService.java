package com.example.demo;

import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class TimeService {
    public String getCurrentTime() {
        return LocalTime.now().toString();
    }
}


