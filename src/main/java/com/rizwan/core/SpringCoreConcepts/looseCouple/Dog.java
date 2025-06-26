package com.rizwan.core.SpringCoreConcepts.looseCouple;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Animal {
  public Dog() {
    System.out.println("Creating Dog");
  }

  @Override
  public void play() {
    System.out.println("Dog is Playing");
  }
}
