package com.azure.ca.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureController {

    @GetMapping("/")
    public String welcomeMessage(){
        return "Hello Azure !";
    }

    @GetMapping("/hello")
    public String helloWorld(){
        System.out.println("*************************************** \n Welcome !");
        return "Welcome to Spring Azure App ";
    }
}
