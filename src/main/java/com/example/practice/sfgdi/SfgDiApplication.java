package com.example.practice.sfgdi;

import com.example.practice.sfgdi.controllers.ConstructorInjectionController;
import com.example.practice.sfgdi.controllers.MyController;
import com.example.practice.sfgdi.controllers.PropertyInjectedController;
import com.example.practice.sfgdi.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

  public static void main(String[] args) {

    ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

    MyController myController = (MyController) ctx.getBean("myController");

    System.out.println("\n*********************Primary Bean Example*************************\n");

    System.out.println(myController.sayHello());

    System.out.println("\n*********************Property Injection*************************\n");
    PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
    System.out.println(propertyInjectedController.getGreetings());

    System.out.println("\n*********************Setter Injection*************************\n");
    SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");
    System.out.println(setterInjectionController.getGreetings());

    System.out.println("\n*********************Setter Injection*************************\n");
    ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");
    System.out.println(constructorInjectionController.getGreetings());

  }
}
