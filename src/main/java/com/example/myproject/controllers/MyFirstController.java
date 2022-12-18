package com.example.myproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyFirstController {
    @GetMapping
    public String processTheRequest() {
        return " Приложение запущено ";
    }

    @GetMapping("/path/to/info")
    public String info() {
        return " Головина Светлана, " + "Мой первый проект," + "19.12.2022г.," +
                " Мой первый опыт создания веб-приложения! ";
    }
}
