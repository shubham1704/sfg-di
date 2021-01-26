package com.example.practice.sfgdi.controllers;

import com.example.practice.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

  private final GreetingService greetingService;

  public I18nController(@Qualifier("i18nGreetingService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {

    return greetingService.sayGreeting();
  }
}
