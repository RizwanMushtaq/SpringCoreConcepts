package com.rizwan.core.SpringCoreConcepts.looseCouple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
  // Autowiring Field based Injection
  @Autowired
  @Qualifier("dogBean")
  private Animal animal;
  @Autowired
  private Student student;
  // Constructor based Injection
//  @Autowired
//  public Person(@Qualifier("dogBean") Animal animal, Student student) {
//    System.out.println("Creating Person");
//    this.animal = animal;
//    this.student = student;
//  }
  // Setter based Injection
//  public Animal getAnimal() {
//    return animal;
//  }
//
//  @Autowired
//  public void setAnimal(@Qualifier("dogBean") Animal animal) {
//    System.out.println("Setting Animal");
//    this.animal = animal;
//  }
//
//  public Student getStudent() {
//    return student;
//  }
//
//  @Autowired
//  public void setStudent(Student student) {
//    System.out.println("Setting Student");
//    this.student = student;
//  }

  public void playWithAnimal() {
    animal.play();
    student.getDetails();
  }
}
