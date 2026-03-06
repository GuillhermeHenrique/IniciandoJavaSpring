package com.example.IniciandoSpring.service;

import org.springframework.stereotype.Service;

@Service

public class testService {
    public String test(String name) {
        return "Testando Java Spring " + name;
    }
}
