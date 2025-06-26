# Spring Core Concepts

### Tight coupling example

### Loose coupling example

### Using Spring Core Concept

    In Spring, it can manage the Beans by itself. We have to tell 3
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
       
