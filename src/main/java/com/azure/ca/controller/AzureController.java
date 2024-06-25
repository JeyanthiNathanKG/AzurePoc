package com.azure.ca.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureController {

    @GetMapping("/")
    public String welcomeMessage(){
        System.out.println("*************************************** \n Home !");
        return "Hello Azure !";
    }

    @GetMapping("/greetings/{name}")
    public String greetings(@PathVariable String name){
        return "Hey " + name + " ! \ngreetings From Azure App Service";
    }
}
