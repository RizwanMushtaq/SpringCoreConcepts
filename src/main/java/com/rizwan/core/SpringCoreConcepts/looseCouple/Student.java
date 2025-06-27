package com.rizwan.core.SpringCoreConcepts.looseCouple;

import org.springframework.stereotype.Component;

@Component("studentBean")
public class Student {
  private String name;
//  private int age;

  public Student() {
    System.out.println("Creating Student");
    this.name = "Rizwan";
  }

  //  public String getName() {
//    return name;
//  }
//
//  public int getAge() {
//    return age;
//  }
//
  public void getDetails() {
    System.out.println("I am Student. I am learning Spring." + name);
  }
//  @Override
//  public String toString() {
//    return "Student{" +
//        "name='" + name + '\'' +
//        ", age=" + age +
//        '}';
//  }
}

