package com.example.practice.sfgdi.controllers;

import com.example.practice.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterControllerTest {

  SetterInjectionController setterInjectionController;

  @BeforeEach
  void setup() {
    setterInjectionController = new SetterInjectionController();
    setterInjectionController.setGreetingService(new GreetingServiceImpl());
  }

  @Test
  void testSetter() {
    System.out.println(setterInjectionController.getGreetings());
  }
}