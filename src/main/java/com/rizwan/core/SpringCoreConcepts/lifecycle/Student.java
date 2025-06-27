package com.rizwan.core.SpringCoreConcepts.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("studentBeanLifecycle")
public class Student {
  public Student() {
    System.out.println("# Creating Student");
  }

  @PostConstruct
  public void created() {
    // Some initialization logic can be added here
    System.out.println("# Student created");
  }

  @PreDestroy
  public void preDestroy() {
    // Some cleanup logic can be added here
    System.out.println("# Student preDestroy");
  }
}
