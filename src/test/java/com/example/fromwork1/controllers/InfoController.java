package com.example.fromwork1.controllers;
@RestController
public class InfoController {
    @GetMapping("/")
    public String getGreeting(){
        return "Приложение запущено";
    }
    @GetMapping("/Info")
    public String getInfoAboutMe(){
        return "Бондарь Ирина\n" +
                "Учебный проект\n" +
                "09.12.2022\n" +
                "Описание: учебный проект, где я изучаю спригн, тестирую инструменты, разбираюсь с maven";
    }
}
