package com.chantelle.springboot01.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
        public class HelloController {

        @GetMapping("/hello")
public String hello() {
        return "Hello from Chantelle's Spring Boot program!"; }
}