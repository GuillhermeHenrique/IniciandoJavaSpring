package com.example.IniciandoSpring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.IniciandoSpring.model.User;
import com.example.IniciandoSpring.service.testService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/test")

public class TestController {

    @Autowired
    private testService testService;

    // public TestController(testService testService) {
    //     this.testService = testService;
    // }

    @GetMapping
    public String test() {
        return testService.test("Guilherme");
    }

    @PostMapping
    public String testPost(@RequestBody User user) {
        return "Hello World " + user.getName();
    }

    @PostMapping("auth")
    public String testePostAuth(@RequestBody User user) {
        if ("Guilherme".equals(user.getName()) && "guilherme@email.com".equals(user.getEmail())) {
            return "Usuário autenticado com sucesso, bem-vindo " + user.getName() + "!";
        } else {
            return "Erro na autenticação";
        }
    }
}