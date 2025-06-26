package com.rizwan.core.SpringCoreConcepts.tightCouple;

public class Person {
  // we are creating a new Animal object here, but it is tightly coupled with
  // Person class.
  // If we want to change the Animal class, we have to change Person class as well.
  // If you want to change Animal at runtime, now you cannot do that.
  Animal animal = new Animal();

  public void playWithAnimal() {
    //using animal
    animal.play();
  }
}
