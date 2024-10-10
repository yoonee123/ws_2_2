package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "org.example")
@Configuration
public class BeanConf {

//    @Bean
//    public Person person1(@Qualifier("DOG")Animal pet) {
//        Person person = new Person();
//        person.setName("이순신");
//        person.setPet(pet);
//
//        return person;
//    }
}
