package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = "org.example")
@Configuration


public class PersonLoader {
    @Bean
    public Dog dog1() {
        Dog dog = new Dog();
        dog.setName("흰둥이");

        return dog;
    }
    @Bean
    public Dog dog2() {
        Dog dog = new Dog();
        dog.setName("뽀삐");

        return dog;
    }
    @Bean
    public Dog dog3() {
        Dog dog = new Dog();
        dog.setName("김두부");

        return dog;
    }

////    @Bean
////    public Person person1() {
////        //FIXME Dog 빈을 사용하고 있지 않음
////        Person person = new Person();
////        person.setName("홍길동");
////        person.setDog(dog1());
////
////        return person;
////    }
//    @Bean
//    public Person person1(Dog dog) {
//        //FIXME Dog 빈을 사용하고 있지 않음
//        Person person = new Person();
//        person.setName("홍길동");
//        person.setDog(dog);
//
//        return person;
//    }
}
