package com.example.practice.sfgdi.controllers;

import com.example.practice.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyInjectedControllerTest {

  PropertyInjectedController propertyInjectedController;

  @BeforeEach
  public void setup() {

    propertyInjectedController = new PropertyInjectedController();
    propertyInjectedController.greetingService = new GreetingServiceImpl();
  }

  @Test
  public void getGreeting()
  {
    System.out.println(propertyInjectedController.getGreetings());
  }
}