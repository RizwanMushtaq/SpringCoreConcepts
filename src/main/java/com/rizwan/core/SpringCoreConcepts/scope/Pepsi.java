package com.rizwan.core.SpringCoreConcepts.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton") // Default scope is singleton
//@Scope("prototype") // Change to "prototype" to create a new instance each time
public class Pepsi {
  @Autowired
  private Soda soda;

  public Pepsi() {
    System.out.println("Creating Pepsi");
  }

  public void drink() {
    System.out.println("Drinking Pepsi");
  }

  public Soda getSoda() {
    return soda;
  }

  public void setSoda(Soda soda) {
    this.soda = soda;
  }
}
