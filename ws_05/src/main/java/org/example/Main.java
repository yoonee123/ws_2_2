package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("MAIN START");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConf.class);
        Person person1 = context.getBean(Person.class);

        System.out.println(person1);
        person1.getPet().bark();
    }
}