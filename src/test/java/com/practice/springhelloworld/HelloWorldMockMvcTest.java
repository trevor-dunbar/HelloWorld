//package com.practice.springhelloworld;
//
//import com.practice.springhelloworld.controller.HelloWorldController;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@ExtendWith(SpringExtension.class)
//@WebMvcTest(HelloWorldController.class)
//public class HelloWorldMockMvcTest {
//
//
//    @Autowired
//    private MockMvc mvc;
//
//    @Test
//    public void givenEmployees_whenGetEmployees_thenReturnJsonArray()
//            throws Exception {
//
//        mvc.perform(get("/hello")
//        ).andExpect(status().isOk())
//                .andExpect(MockMvcResultMatchers.content().string("Hello world"));
//    }
//}
