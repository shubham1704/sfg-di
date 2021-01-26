package com.example.practice.sfgdi.controllers;

import com.example.practice.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyInjectedControllerTest {

  PropertyInjectedController propertyInjectedController;

  @BeforeEach
  public void setup() {

    propertyInjectedController = new PropertyInjectedController();
    propertyInjectedController.greetingService = new ConstructorGreetingService();
  }

  @Test
  public void getGreeting()
  {
    System.out.println(propertyInjectedController.getGreetings());
  }
}