package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("MAIN START");

//        Person person = new Person();
//        System.out.println(person);

//        Dog dog = new Dog();
//        System.out.println(dog);

        System.out.println("------------------------------");

        ApplicationContext context = new AnnotationConfigApplicationContext(PersonLoader.class);
        Person person1 = context.getBean(Person.class);
        person1.setName("홍길동");
        //person1.getDog().setName("흰둥이");
        System.out.println(person1);

        //Dog dog1 = context.getBean(Dog.class);
        //System.out.println(dog1);
    }
}