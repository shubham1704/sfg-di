package com.example.practice.sfgdi.controllers;

import com.example.practice.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {

  private final GreetingService greetingService;

  public ConstructorInjectionController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreetings(){
    return greetingService.sayGreeting();
  }

}
