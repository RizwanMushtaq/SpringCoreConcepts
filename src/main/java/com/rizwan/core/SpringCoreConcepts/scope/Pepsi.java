package com.rizwan.core.SpringCoreConcepts.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton") // Default scope is singleton
@Scope("prototype") // Change to "prototype" to create a new instance each time
public class Pepsi {
  public Pepsi() {
    System.out.println("Creating Pepsi");
  }

  public void drink() {
    System.out.println("Drinking Pepsi");
  }
}
