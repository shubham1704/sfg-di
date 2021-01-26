package com.example.practice.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServices implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello World - Property";
  }
}
