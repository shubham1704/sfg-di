package com.example.practice.sfgdi.controllers;

import com.example.practice.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterControllerTest {

  SetterInjectionController setterInjectionController;

  @BeforeEach
  void setup() {
    setterInjectionController = new SetterInjectionController();
    setterInjectionController.setGreetingService(new ConstructorGreetingService());
  }

  @Test
  void testSetter() {
    System.out.println(setterInjectionController.getGreetings());
  }
}