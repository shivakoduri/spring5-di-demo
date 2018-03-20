package com.myprojects.spring.didemo.controllers;

import com.myprojects.spring.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!");

        return greetingService.sayGreeting();
    }
}
