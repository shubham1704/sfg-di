package com.example.practice.sfgdi.controllers;

import com.example.practice.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

  public GreetingService greetingService;

  public String getGreetings(){
    return greetingService.sayGreeting();
  }

}
