package com.rizwan.core.SpringCoreConcepts.looseCouple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
  Animal animal;

  @Autowired
  public Person(@Qualifier("dogBean") Animal animal) {
    this.animal = animal;
  }

  public void playWithAnimal() {
    animal.play();
  }
}
