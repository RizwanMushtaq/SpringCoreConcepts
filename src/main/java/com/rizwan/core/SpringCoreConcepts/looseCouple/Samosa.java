package com.rizwan.core.SpringCoreConcepts.looseCouple;

public class Samosa {
  private String name;

  public Samosa(String name) {
    System.out.println("Creating Samosa: " + name);
    this.name = name;
  }

  public void eat() {
    System.out.println("Eating Samosa " + name);
  }
}
