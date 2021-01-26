package com.example.practice.sfgdi.controllers;

import com.example.practice.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstrucrotControllerTest {

  ConstructorInjectionController constructorInjectionController;

  @BeforeEach
  void setup() {
    constructorInjectionController = new ConstructorInjectionController(new ConstructorGreetingService());
  }

  @Test
  void testController() {
    System.out.println(constructorInjectionController.getGreetings());
  }

}