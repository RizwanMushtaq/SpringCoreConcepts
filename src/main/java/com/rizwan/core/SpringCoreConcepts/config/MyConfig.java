package com.rizwan.core.SpringCoreConcepts.config;

import com.rizwan.core.SpringCoreConcepts.looseCouple.Samosa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
  //declaration of beans using @Bean annotation
  @Bean(name = "samosa1")
  public Samosa getSamosa1() {
    return new Samosa("Samosa1");
  }

  @Bean(name = "samosa2")
  public Samosa getSamosa2() {
    return new Samosa("Samosa2");
  }
}
