package com.myprojects.spring.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl  implements GreetingService {

    public static final String HELLO_ = "Hello Gurus!!!! - Original";

    @Override
    public String sayGreeting() {
        return HELLO_;
    }
}
