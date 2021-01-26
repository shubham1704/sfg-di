package com.example.practice.sfgdi.controllers;

import com.example.practice.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

  @Autowired
  public GreetingService greetingService;

  public String getGreetings(){
    return greetingService.sayGreeting();
  }

}
