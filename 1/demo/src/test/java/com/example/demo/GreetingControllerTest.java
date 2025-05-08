//package com.example.demo;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@WebMvcTest(GreetingController.class)
//public class GreetingControllerTest {
//
//    @Autowired
//    private MockMvc mvc;
//    private GreetingService greetingService;
//
//    @Test
//    void getGreetingReturnsJsonWithMsg() throws Exception {
//        //prepairing mock answer from service
//        when(greetingService.great()).thenReturn("Testowe REST powitanie");
//
//
//        mvc.perform(get("/api/greeting"))
//                .andExpect(status().isOk())
//                .andExpect(content().string("Testowe REST powitanie"));
//
//    }
//}
