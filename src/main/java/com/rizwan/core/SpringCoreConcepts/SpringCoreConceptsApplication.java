package com.rizwan.core.SpringCoreConcepts;

import com.rizwan.core.SpringCoreConcepts.looseCouple.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreConceptsApplication {
  public static void main(String[] args) {
    /* Here we are creating Animal type variable, then creating Cat Instance
    and then passing it to Person Instance. This is lot of work and managing
    Beans in large Projects. -> Here actually helps us Spring Framework. */
    //    Animal animal = new Cat();
    //    Person p = new Person(animal);
    //    p.playWithAnimal();

    /* In Spring, it can manage the Beans by itself. We have to tell 3
    important things to spring?
     1) About the beans - We can do this by using annotations like
        @Component, @Service, @Repository, @Controller etc.
     2) About dependencies -> We can do this by using @Autowired annotation.
        Spring will automatically inject the dependencies for us.
        We can also use constructor injection, setter injection or field injection.
        Here we are using constructor injection.
     3) Where to search the beans -> We can do this by using @ComponentScan
        annotation. By default, it will scan the package where the main class is
        present and its sub-packages. If we want to scan other packages, we can
        use @ComponentScan annotation with basePackages attribute.
     */
    ApplicationContext context =
        SpringApplication.run(SpringCoreConceptsApplication.class,
            args);
    Person personBean = context.getBean(Person.class);
    personBean.playWithAnimal();
  }
}
