package com.rizwan.core.SpringCoreConcepts;

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
    //ApplicationContext is the interface that provides configuration for the
    // entire application. It is the central interface to the Spring IoC container.
    ApplicationContext context =
        SpringApplication.run(SpringCoreConceptsApplication.class,
            args);
//    Person personBean = context.getBean(Person.class);
//    personBean.playWithAnimal();
    //Bean Scope
    //first time it will create a new instance of Pepsi
//    Pepsi pepsi = context.getBean(Pepsi.class);
//    System.out.println(pepsi);
//    pepsi.drink();
//    //second time it will return the same instance of Pepsi
//    Pepsi pepsi2 = context.getBean(Pepsi.class);
//    System.out.println(pepsi2);
//    pepsi2.drink();
//    //third time it will return the same instance of Pepsi
//    Pepsi pepsi3 = context.getBean(Pepsi.class);
//    System.out.println(pepsi3);
//    pepsi3.drink();
    //Using Pepsi with Soda as prototype scope with ProxyMode as TARGET_CLASS
//    Pepsi pepsi = context.getBean(Pepsi.class);
//    System.out.println(pepsi);
//    Soda soda = pepsi.getSoda();
//    System.out.println(soda);
//    Pepsi pepsi1 = context.getBean(Pepsi.class);
//    System.out.println(pepsi1);
//    Soda soda1 = pepsi1.getSoda();
//    System.out.println(soda1);
//    Pepsi pepsi2 = context.getBean(Pepsi.class);
//    System.out.println(pepsi2);
//    Soda soda2 = pepsi2.getSoda();
//    System.out.println(soda2);
  }
}
