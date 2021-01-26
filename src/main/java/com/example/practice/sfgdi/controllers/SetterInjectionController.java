package com.example.practice.sfgdi.controllers;

import com.example.practice.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {

  private GreetingService greetingService;

  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreetings(){
    return greetingService.sayGreeting();
  }

}
