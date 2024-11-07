package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 스프링이 관리할 빈을 정의하는 클래스
// @ComponentScan 어노테이션을 통해 org.example 패키지 내의 @Component가 붙은 클래스를 자동으로 검색하여 빈으로 등록합니다.
@ComponentScan(basePackages = "org.example")
@Configuration
public class BeanConf {

    // @Bean 어노테이션을 사용하여 Person 객체를 스프링 빈으로 등록합니다.
    // @Qualifier("DOG") 어노테이션은 DI(Dependency Injection)에서 특정 구현체를 주입하기 위해 사용됩니다.
    // 이 예시에서는 "DOG"라는 이름의 Animal 빈을 주입받아 Person 객체의 pet 속성으로 설정합니다.

//    @Bean
//    public Person person1(@Qualifier("DOG") Animal pet) {
//        Person person = new Person();
//        person.setName("이순신");
//        person.setPet(pet);
//
//        return person;
//    }
}
