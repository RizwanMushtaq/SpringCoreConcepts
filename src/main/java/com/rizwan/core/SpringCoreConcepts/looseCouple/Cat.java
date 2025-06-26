package com.rizwan.core.SpringCoreConcepts.looseCouple;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Animal {
  public Cat() {
    System.out.println("Creating Cat");
  }

  @Override
  public void play() {
    System.out.println("Cat is Playing");
  }
}
