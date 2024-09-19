package com.seoyoon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PersonLoader {

    //@Primary
    @Bean(name = "Hong")
    public Person person1() {
        Person newOne = new Person();
        newOne.setName("홍길동");
        newOne.setAge(345);

        return newOne;
    }

    @Bean(name = "Lee")
    public Person person2() {
        Person newOne = new Person();
        newOne.setName("이순신");
        newOne.setAge(40);

        return newOne;
    }

    @Bean(name = "Super")
    public Person person3() {
        Person newOne = new Person();
        newOne.setName("슈퍼맨");
        newOne.setAge(2000);

        return newOne;
    }
}
